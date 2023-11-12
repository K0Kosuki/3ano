# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio
from cryptography.fernet import Fernet
import hashlib
import json
import base64
conn_cnt = 0
conn_port = 7777
max_msg_size = 9999

key = b'S30-9KpfUiyaXOnSqcpxmdxsIEOlVZU_0HAUo1ObDjE='
f = Fernet(key)

class ServerWorker(object):
    """ Classe que implementa a funcionalidade do SERVIDOR. """
    def __init__(self, cnt, addr=None):
        """ Construtor da classe. """
        self.id = cnt
        self.addr = addr
        self.msg_cnt = 0
    def process(self, msg):
        """"""
        self.msg_cnt += 1
        data:dict[bytes,str]=json.loads(msg)
        msg_part = data['msg']
        
        print(data['h'])
        
        decrypt_msg = f.decrypt(base64.b64decode(msg_part)).decode()
        h = hashlib.sha256(decrypt_msg.encode()).hexdigest()
        
        if h == data['h']:
            
            print(f'Messagen encrypt: {decrypt_msg}')
            print(f'Messagen original: {msg_part}')
        else:
            print(f"[{self.id}] erro validação")
        
        return b'3123321'


#        txt = msg.decode()
 #       print('Ciphertext %d : %r' % (self.id,txt))
  #      new_msg = txt.upper().encode()
   #     result = f.decrypt(msg)
    #    print(f'Plaintext: {result.decode("utf-8")}')
     #   
      #  return new_msg if len(new_msg)>0 else None


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
