import asyncio
import json
import hashlib
from cryptography.fernet import Fernet
from cryptography.hazmat.primitives import hashes, serialization
from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.hazmat.primitives.kdf.pbkdf2 import PBKDF2HMAC
from cryptography.hazmat.primitives.serialization import load_pem_public_key, load_pem_parameters
import base64
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad
import os
from cryptography.hazmat.backends import default_backend
from cryptography.hazmat.primitives.asymmetric import dh
from cryptography.hazmat.primitives.kdf.hkdf import HKDF
from Crypto.Util import Counter
conn_port = 7777
max_msg_size = 9999




class Client:
    """ Classe que implementa a funcionalidade de um CLIENTE. """
    def __init__(self, sckt=None):
        """ Construtor da classe. """
        self.sckt = sckt
        self.msg_cnt = 0
        
    def process(self, msg=b""):

        self.msg_cnt += 1
        match self.msg_cnt :
            case 1:
                
                return bytes([self.msg_cnt])
            case 2:
                pem_rsa,signature,pem_dh,parameters= msg.split(b"---SPLIT---")
                
                #rsa_server_public_key = serialization.load_pem_public_key(pem_rsa)
                rsa_server_public_key = load_pem_public_key(pem_rsa)
                try:
                    rsa_server_public_key.verify(
                        signature,
                        pem_dh,
                        padding.PSS(
                            mgf=padding.MGF1(hashes.SHA256()),
                            salt_length=padding.PSS.MAX_LENGTH
                        ),
                        hashes.SHA256()
                    )
                except:
                    raise ValueError("Signature verification failed!")
                
                para = load_pem_parameters(parameters, backend=default_backend())
                dh_server_public_key = load_pem_public_key(pem_dh)
                self.private_key = para.generate_private_key()
                self.public_key = self.private_key.public_key()
                self.shared_key = self.private_key.exchange(dh_server_public_key)
               # ShowkeyC = self.shared_key
               # print (ShowkeyC)
                pem_c = self.public_key.public_bytes(
                    encoding=serialization.Encoding.PEM,
                    format=serialization.PublicFormat.SubjectPublicKeyInfo
                )
                
                return bytes([self.msg_cnt])+pem_c
            case _:
                    data = json.loads(msg)
                    if not 'msg' in data or not 'h' in data:
                      raise ValueError('Error Message')
                    dec_msg = self.decrypt(data['msg'])
                    h = hashlib.sha256(dec_msg.encode()).hexdigest()
                    if h != data['h']: raise ValueError('Error Message')
                
                    print(f'Received ({self.msg_cnt}): {dec_msg}, hash: {h}')
                
                    input_msg = input('Input message to send (empty to finish)\n')
                    if  not input_msg: return None
                
                    return bytes([3]) + json.dumps({
                    'msg': self.encrypt(input_msg),
                    'h': hashlib.sha256(input_msg.encode()).hexdigest(),
                    }, separators=(',',':')).encode()
    
    def encrypt(self, msg: str|bytes) -> str:
        if isinstance(msg, str): msg = msg.encode()
        key = HKDF(
                algorithm=hashes.SHA256(),
                length=16,  
                salt=None,  
                info=b'encryption',  
                backend=default_backend()
                ).derive(self.shared_key)
        nonce = os.urandom(8)
        #ctr = Counter.new(64, prefix=nonce)
        #cipher = AES.new(key, AES.MODE_CTR,counter=ctr)
        cipher = AES.new(key, AES.MODE_CTR,nonce = nonce)
        encrypt_data = cipher.encrypt(msg)
        return base64.b64encode(nonce + encrypt_data).decode()

    def decrypt(self, msg:str|bytes) -> str:
        if isinstance(msg, bytes): msg = msg.decode()
        msg = base64.b64decode(msg)
        key = HKDF(
                algorithm=hashes.SHA256(),
                length=16,  
                salt=None,  
                info=b'encryption',  
                backend=default_backend()
                ).derive(self.shared_key)
        nonce = msg[:8]
        ctr = Counter.new(64, prefix=nonce)
        encrypt_data = msg[8:]
        cipher = AES.new(key, AES.MODE_CTR,counter=ctr)
        decrypt_data = cipher.decrypt(encrypt_data)
        return decrypt_data.decode()











#
# Funcionalidade Cliente/Servidor
#
# obs: não deverá ser necessário alterar o que se segue
#

async def tcp_echo_client():
    reader, writer = await asyncio.open_connection('127.0.0.1', conn_port)
    addr = writer.get_extra_info('peername')
    client = Client(addr)
    msg = client.process()
    while msg:
        writer.write(msg)
        msg = await reader.read(max_msg_size)
        if msg :
            msg = client.process(msg)
        else:
            break
    writer.write(b'\n')
    print('Socket closed!')
    writer.close()

def run_client():
    loop = asyncio.get_event_loop()
    loop.run_until_complete(tcp_echo_client())


run_client()
