# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio
import json
from cryptography.hazmat.primitives import hashes
import os
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
conn_cnt = 0
conn_port = 7777
max_msg_size = 9999
key = b'\xd0\xfbz\xdb\x8f0R\xd1Clo\xe0\x81\xe2|a'
iv = b'\xa8\xb7\xe6\x03\xb0\xd09\xe9\xb8sV\xc5\xf3\x1f\xad\xf2'
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
            data: dict[str, str] = json.loads(msg)
            print(f"JSON recebido: {data}\n")
            
            hash_obj2 = hashes.Hash(hashes.SHA256())
            hash_obj2.update(bytes.fromhex(data['Msg']))
            hash_resultante2 = hash_obj2.finalize().hex()
            if hash_resultante2 == data['hash']:
                print(f"{data['Msg']}\n")
                print("Mensagem do cliente não foi modificada\n")
            else:
                print("Mensagem do cliente não foi modificada\n")
            cipher = Cipher(algorithms.AES(key), modes.CTR(iv))
            decryptor = cipher.decryptor()
            plaintext = decryptor.update(bytes.fromhex(data['Msg'])) + decryptor.finalize()
            print("Mensagem desencriptada (%d): %r\n" % (self.msg_cnt , plaintext.decode()))
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