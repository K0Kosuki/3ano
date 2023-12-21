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

conn_cnt = 0
conn_port = 7777
max_msg_size = 9999

iv = b'\xa8\xb7\xe6\x03\xb0\xd09\xe9\xb8sV\xc5\xf3\x1f\xad\xf2'
parameters = dh.generate_parameters(generator=2, key_size=2048)

class ServerWorker(object):
    """ Classe que implementa a funcionalidade do SERVIDOR. """
    def __init__(self, cnt, addr=None):
        """ Construtor da classe. """
        self.id = cnt
        self.addr = addr
        self.msg_cnt = 0
    def process(self, msg):
        """ Processa uma mensagem (`bytestring`) enviada pelo CLIENTE.
            Retorna a mensagem a transmitir como resposta (`None` para
            finalizar ligação) """
        self.msg_cnt += 1
        try:
            data = json.loads(msg)
            print(f"JSON recebido: {data}\n")
            para = data["para"]
            pem =data["pem"]
            if isinstance(para, str): para = para.encode()
            # Deserializa os parâmetros do cliente
            client_parameters = load_pem_parameters(para)

            # Gera a chave privada do servidor e a chave pública do cliente
            server_private_key = client_parameters.generate_private_key()
            if isinstance(pem, str): pem = pem.encode()
            peer_public_key = load_pem_public_key(pem)
            

            # Realiza a troca de chaves
            shared_key = server_private_key.exchange(peer_public_key)

            # Deriva a chave compartilhada
            derived_key = HKDF(
                algorithm=hashes.SHA256(),
                length=32,
                salt=None,
                info=b'handshake data',
            ).derive(shared_key)
            hash_obj2 = hashes.Hash(hashes.SHA256())
            hash_obj2.update(bytes.fromhex(data['Msg']))
            hash_resultante2 = hash_obj2.finalize().hex()
            if hash_resultante2 == data['hash']:
                print(f"{data['Msg']}\n")
                print("Mensagem do cliente não foi modificada\n")
            else:
                print("Mensagem do cliente não foi modificada\n")
            cipher = Cipher(algorithms.AES(derived_key), modes.CTR(iv))
            decryptor = cipher.decryptor()
            plaintext = decryptor.update(bytes.fromhex(data['Msg'])) + decryptor.finalize()
            print("Mensagem encrypt: ",data['Msg'])
            print("Mensagem desencriptada  :",plaintext)
            return plaintext
        except json.JSONDecodeError as e:
            print(f"Erro ao decodificar JSON: {e}")
            return b'Erro no formato JSON'
    
        
        


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