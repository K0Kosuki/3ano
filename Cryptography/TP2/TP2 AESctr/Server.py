import asyncio
import json
import hashlib
from cryptography.fernet import Fernet
from cryptography.hazmat.primitives import hashes, serialization

from cryptography.hazmat.primitives.serialization import load_pem_public_key, load_pem_parameters,ParameterFormat,Encoding

import base64
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad
import os
from cryptography.hazmat.backends import default_backend
from cryptography.hazmat.primitives.asymmetric import dh
from cryptography.hazmat.primitives.kdf.hkdf import HKDF

from Crypto.Util import Counter

conn_cnt = 0
conn_port = 7777
max_msg_size = 9999






class ServerWorker(object):
    """ Classe que implementa a funcionalidade do SERVIDOR. """
    def __init__(self, cnt, addr=None):
        """ Construtor da classe. """
        self.id = cnt
        self.addr = addr
        self.msg_cnt = 0

        
    def process(self, msg:bytes):
        
        if not msg : return None #
        
        msg_type = msg[0]
        msg = msg[1:] 
        match msg_type:
            case 1:
                self.parameters = dh.generate_parameters(generator=2, key_size=2048)
                self.private_key = self.parameters.generate_private_key()
                self.public_key = self.private_key.public_key()
                pem = self.public_key.public_bytes(
                    encoding=serialization.Encoding.PEM,
                    format=serialization.PublicFormat.SubjectPublicKeyInfo
                )
                p_pem =self.parameters.parameter_bytes(
                encoding=Encoding.PEM,
                format=ParameterFormat.PKCS3
                )
                return pem + b"---SPLIT---" + p_pem
            case 2:
                pem_c= msg
                client_public_key = load_pem_public_key(pem_c)
                self.shared_key = self.private_key.exchange(client_public_key)
                
                return json.dumps({   
                    'msg': self.encrypt("Connect Sucess"),
                    'h': hashlib.sha256(b"Connect Sucess").hexdigest()
                }, separators=(',',':')).encode()
             
            case 3:
                  data = json.loads(msg)
                  if not 'msg' in data or not 'h' in data:
                    raise ValueError('Error Message')
                
                  dec_msg = self.decrypt(data["msg"])
                  h = hashlib.sha256(dec_msg.encode()).hexdigest()
                  if h != data['h']: raise ValueError('Error Message')
                  print(f'Ciphertext {self.id} : {data["msg"]}')
                  result = self.decrypt(data["msg"])
                  print(f'Plaintext: {result}')
                  return msg 
          



           


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
        ctr = Counter.new(64, prefix=nonce)
        cipher = AES.new(key, AES.MODE_CTR,counter=ctr)
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
        return decrypt_data.decode('utf-8')












#
#
# Funcionalidade Cliente/Servidor
#
# obs: não deverá ser necessário alterar o que se segue
#


async def handle_echo(reader, writer):
    global conn_cnt
    conn_cnt +=1
    addr = writer.get_extra_info('peername')
    srvwrk = ServerWorker(conn_cnt, addr)
    data = await reader.read(max_msg_size)
    while True:
        if not data: continue
        if data[:1]==b'\n': break
        data = srvwrk.process(data)
        if not data: break
        writer.write(data)
        await writer.drain()
        data = await reader.read(max_msg_size)
    print("[%d]" % srvwrk.id)
    writer.close()


def run_server():
    loop = asyncio.get_event_loop()
    coro = asyncio.start_server(handle_echo, '127.0.0.1', conn_port)
    server = loop.run_until_complete(coro)
    # Serve requests until Ctrl+C is pressed
    print('Serving on {}'.format(server.sockets[0].getsockname()))
    print('  (type ^C to finish)\n')
    try:
        loop.run_forever()
    except KeyboardInterrupt:
        pass
    # Close the server
    server.close()
    loop.run_until_complete(server.wait_closed())
    loop.close()
    print('\nFINISHED!')

run_server()
