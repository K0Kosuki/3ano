# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio
import socket
import hashlib
import json


conn_port = 7777      # Define a porta para se conectar ao servidor e tamanho da messagem que pode receber
max_msg_size = 9999  



max_msg_size = 9999

class Client:
    """ Classe que implementa a funcionalidade de um CLIENTE. """
    def __init__(self, sckt=None):
        """ Construtor da classe. """
        self.sckt = sckt
        self.msg_cnt = 0
    def process(self, msg=b""):
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
    # Estabelece uma conexão TCP com o servidor usando asyncio
    reader, writer = await asyncio.open_connection('127.0.0.1', conn_port)
    # Obtém informações da conexão, como o endereço do cliente
    addr = writer.get_extra_info('peername')
    client = Client(addr) #cire um objeto do class Cliente com endereço do cliente.
    msg = client.process()
    while msg:
        writer.write(msg)       #Envia a mensage e espear servidor acaba de ler
        msg = await reader.read(max_msg_size)
        if msg :
            msg = client.process(msg)
        else:
            break
    writer.write(b'\n')
    print('Socket closed!')
    writer.close()

def run_client():
    loop = asyncio.get_event_loop()#Função para executar o cliente TCP no loop de eventos do asyncio
    loop.run_until_complete(tcp_echo_client())


run_client()
