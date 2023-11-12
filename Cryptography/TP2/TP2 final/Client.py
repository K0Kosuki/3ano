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
        print("choice one")
        print("1-sha256\n")
        print("2\n")
        print("3\n")
        choice = input()
        if choice.isdigit() and 1<=int(choice)<=3:
            match choice:
                case 1:
                     print('Input message to send (empty to finish)')
                     return_msg:str = input()
                     h = hashlib.sha256(return_msg.encode()).hexdigest()
                     return_data = json.dumps({'msg':return_msg, 'h':h})
        else:
            print('Erro option')            
       
        
        
        
        
        
        print('Input message to send (empty to finish)')
        return_msg:str = input()
        h = hashlib.sha256(return_msg.encode()).hexdigest()
        return_data = json.dumps({'msg':return_msg, 'h':h})
     
        return return_data.encode()

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
