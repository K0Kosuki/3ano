# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio
from cryptography.fernet import Fernet
import hashlib
import json
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
    def process(self, msg):
        self.msg_cnt += 1

        data:dict[str,str]=json.loads(msg)
        h = hashlib.sha256(data['msg'].encode()).hexdigest()

       
        if h == data['h']:
            print(f"[{self.id}] {data['msg']}")
        else:
            print(f"[{self.id}] erro validação")
        
        return b'Sus'


#
#
# Funcionalidade Cliente/Servidor
#
# obs: não deverá ser necessário alterar o que se segue
#


async def handle_echo(reader, writer):
    global conn_cnt
    conn_cnt +=1
    addr = writer.get_extra_info('peername') #Obtém informações do cliente conectado
    srvwrk = ServerWorker(conn_cnt, addr)
    data = await reader.read(max_msg_size) # Lê os dados enviados pelo cliente
    while True:
        if not data: continue
        if data[:1]==b'\n': break
        data = srvwrk.process(data) # Processa os dados recebidos
        if not data: break
        writer.write(data) # Escreve a resposta para o cliente
        await writer.drain() # Aguarda até que todos os dados sejam enviados
        data = await reader.read(max_msg_size)
    print("[%d]" % srvwrk.id)
    writer.close()


def run_server():
    loop = asyncio.get_event_loop()
     # Inicia o servidor no endereço e porta especificados
    coro = asyncio.start_server(handle_echo, '127.0.0.1', conn_port)
    server = loop.run_until_complete(coro)# Executa o loop de eventos indefinidamente
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
