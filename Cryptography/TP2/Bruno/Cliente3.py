# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio
import socket
import json
from cryptography.hazmat.primitives import hashes
import os
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
from cryptography.hazmat.primitives.asymmetric import dh
from cryptography.hazmat.primitives.kdf.hkdf import HKDF
from cryptography.hazmat.primitives import serialization
from cryptography.hazmat.primitives.serialization import load_pem_public_key, load_pem_parameters,ParameterFormat,Encoding

conn_port = 7777
max_msg_size = 9999


iv = b'\xa8\xb7\xe6\x03\xb0\xd09\xe9\xb8sV\xc5\xf3\x1f\xad\xf2'

parameters = dh.generate_parameters(generator=2, key_size=2048)

#print(parameters)
private_key = parameters.generate_private_key()

peer_public_key = parameters.generate_private_key().public_key()
shared_key = private_key.exchange(peer_public_key)

derived_key = HKDF(
     algorithm=hashes.SHA256(),
     length=32,
     salt=None,
    info=b'handshake data',
 ).derive(shared_key)
print(derived_key)
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
        cipher = Cipher(algorithms.AES(derived_key), modes.CTR(iv))
        encyrptor = cipher.encryptor()
        #print('Received ', msg.decode()))
        print('Input message to send (empty to finish)')
        input_msg = input().encode('UTF-8')
        new_msg = encyrptor.update(input_msg) + encyrptor.finalize()
        print(new_msg)
        hash_obj = hashes.Hash(hashes.SHA256())
        hash_obj.update(new_msg)
        hash_resultante = hash_obj.finalize().hex()
        print(hash_resultante)
        hex_new_msg = new_msg.hex()
        peer_public_key_bytes = peer_public_key.public_bytes(
            encoding=serialization.Encoding.PEM,
            format=serialization.PublicFormat.SubjectPublicKeyInfo
        )
        p_pem =parameters.parameter_bytes(
                encoding=Encoding.PEM,
                format=ParameterFormat.PKCS3
                )
        

        json_server=json.dumps({"pem":peer_public_key_bytes.decode(),"para":p_pem.decode(),"Msg":hex_new_msg,"hash": hash_resultante})
        return json_server.encode('utf8')
        
        
     



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
