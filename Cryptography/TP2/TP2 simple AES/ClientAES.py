       # Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio
import socket
import json
from cryptography.hazmat.primitives import hashes
import os
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes

conn_port = 7777
max_msg_size = 9999

key = b'\xd0\xfbz\xdb\x8f0R\xd1Clo\xe0\x81\xe2|a'
iv = b'\xa8\xb7\xe6\x03\xb0\xd09\xe9\xb8sV\xc5\xf3\x1f\xad\xf2'

class Client:
    """ Classe que implementa a funcionalidade de um CLIENTE. """
    def __init__(self, sckt=None):
        """ Construtor da classe. """
        self.sckt = sckt
        self.msg_cnt = 0
    def process(self, msg=b""):
        """ Processa uma mensagem (`bytestring`) enviada pelo SERVIDOR.
            Retorna a mensagem a transmitir como resposta (`None` para
            finalizar ligação) """
        self.msg_cnt +=1
        cipher = Cipher(algorithms.AES(key), modes.CTR(iv))
        encyrptor = cipher.encryptor()
        print('Received (%d): %r\n' % (self.msg_cnt , msg.decode()))
        print('Input message to send (empty to finish)\n')
        input_msg = input().encode('UTF-8')
        new_msg = encyrptor.update(input_msg) + encyrptor.finalize()
        print(new_msg)
        hash_obj = hashes.Hash(hashes.SHA256())
        hash_obj.update(new_msg)
        hash_resultante = hash_obj.finalize().hex()
        print(hash_resultante)
        hex_new_msg = new_msg.hex()
        json_server=json.dumps({"Msg":hex_new_msg,"hash": hash_resultante})
        print("json enviado\n",json_server)
        return json_server.encode()
     



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
