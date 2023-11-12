# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio
import json
import hashlib

from cryptography.hazmat.primitives import hashes, serialization
from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.hazmat.primitives.kdf.pbkdf2 import PBKDF2HMAC

import base64
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad

import os

conn_port = 7777
max_msg_size = 9999

class Client:
    """ Classe que implementa a funcionalidade de um CLIENTE. """
    def __init__(self, sckt=None):
        """ Construtor da classe. """
        self.sckt = sckt
        self.msg_cnt = 0
        
        self.salt:bytes = b''
        
    def process(self, msg:bytes=b""):
        """ Processa uma mensagem (`bytestring`) enviada pelo SERVIDOR.
            Retorna a mensagem a transmitir como resposta (`None` para
            finalizar ligação) """
        self.msg_cnt +=1
        match self.msg_cnt:
            case 1: return bytes([self.msg_cnt])
            case 2:
                pem, signature, random_msg = msg.split(b"---SPLIT---")
                server_public_key = serialization.load_pem_public_key(pem)
                try:
                    server_public_key.verify(
                        signature,
                        random_msg,
                        padding.PSS(
                            mgf=padding.MGF1(hashes.SHA256()),
                            salt_length=padding.PSS.MAX_LENGTH
                        ),
                        hashes.SHA256()
                    )
                except:
                    raise ValueError("Signature verification failed!")
                self.salt = os.urandom(16)
                encrypted_salt = server_public_key.encrypt(
                    self.salt,
                    padding.OAEP(
                        mgf=padding.MGF1(algorithm=hashes.SHA256()),
                        algorithm=hashes.SHA256(),
                        label=None
                    )
                )
                return bytes([self.msg_cnt]) + encrypted_salt
            case _:
                data = json.loads(msg)
                if not 'msg' in data or not 'h' in data:
                    raise ValueError('Error Message')
                
                dec_msg = self.decrypt(data['msg'])
                h = hashlib.md5(dec_msg.encode()).hexdigest()
                if h != data['h']: raise ValueError('Error Message')
                
                print(f'Received ({self.msg_cnt}): {dec_msg}, hash: {h}')
                
                input_msg = input('Input message to send (empty to finish)\n')
                if  not input_msg: return None
                
                return bytes([3]) + json.dumps({
                    'msg': self.encrypt(input_msg),
                    'h': hashlib.md5(input_msg.encode()).hexdigest(),
                }, separators=(',',':')).encode()

    def decrypt(self, msg:str|bytes) -> str:
        if isinstance(msg, bytes): msg = msg.decode()
        msg = base64.b64decode(msg)
        password = msg[:48]
        iv = password[:16]
        key = PBKDF2HMAC(
            algorithm=hashes.SHA256(),
            length = 32,
            salt=self.salt,
            iterations = 1000
        ).derive(password[16:])
        encrypt_data = msg[48:]
        cipher = AES.new(key, AES.MODE_CBC, iv)
        decrypt_data = unpad(cipher.decrypt(encrypt_data), AES.block_size)
        return decrypt_data.decode()
    
    def encrypt(self, msg: str|bytes) -> str:
        if isinstance(msg, str): msg = msg.encode()
        random_bytes = os.urandom(48)
        iv = random_bytes[:16]
        key = PBKDF2HMAC(
            algorithm=hashes.SHA256(),
            length = 32,
            salt=self.salt,
            iterations = 1000
        ).derive(random_bytes[16:])
        cipher = AES.new(key, AES.MODE_CBC, iv)
        encrypt_data = random_bytes + cipher.encrypt(pad(msg, AES.block_size))
        return base64.b64encode(encrypt_data).decode()
        
#
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
