# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
from cryptography.fernet import Fernet
import asyncio
import socket
import hashlib
import json
import base64
conn_port = 7777
max_msg_size = 9999

key = b'S30-9KpfUiyaXOnSqcpxmdxsIEOlVZU_0HAUo1ObDjE='
f = Fernet(key)

class Client:
    """ Classe que implementa a funcionalidade de um CLIENTE. """
    def __init__(self, sckt=None):
        """ Construtor da classe. """
        self.sckt = sckt
        self.msg_cnt = 0
    def process(self, msg=b""):
       
        self.msg_cnt +=1

        print('Input message to send (empty to finish)')
        message:str = input()
        encrypt_msg = f.encrypt(message.encode())
        print(encrypt_msg)
        h = hashlib.sha256(message.encode()).hexdigest()
        return_msg = base64.b64encode(encrypt_msg).decode()                       # 哈希算法通常要求输入为字节串。encode() 方法将字符串转换为字节串，以便能够在哈希算法中处理。     
        return_data = json.dumps({'msg':return_msg, 'h':h}).encode()        #hexdigest()方法将二进制数据表示的哈希值转换为十六进制形式的字符串   
        print('(321-') 
        return return_data

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
