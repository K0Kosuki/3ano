# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio
import asyncio
import json
import hashlib
import base64
from Crypto.Cipher import AES
import os


conn_port = 7777
max_msg_size = 9999

key = b'HelloSever114514'

class Client:
    """ Classe que implementa a funcionalidade de um CLIENTE. """
    def __init__(self, sckt=None):
        """ Construtor da classe. """
        self.sckt = sckt
        self.msg_cnt = 0
    def process(self, msg=b""):
        self.msg_cnt += 1
        nonce = os.urandom(8)
        cipher = AES.new(key, AES.MODE_CTR,nonce=nonce)

        print('Input message to send (empty to finish)')
        return_msg = input()
        
        
        h = hashlib.sha256(return_msg.encode()).hexdigest()
        encrypted_msg = cipher.encrypt(return_msg.encode())
        encrypted_msg_b64 = base64.b64encode(nonce + encrypted_msg).decode()
        
        return_data = json.dumps({'msg': encrypted_msg_b64, 'h': h})
        return return_data.encode()

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
