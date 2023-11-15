# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio
import json
import hashlib
import base64
from Crypto.Cipher import AES


conn_cnt = 0
conn_port = 7777
max_msg_size = 9999

key = b'HelloSever114514'
nonce = b'non123dsah'
class ServerWorker(object):
    """ Classe que implementa a funcionalidade do SERVIDOR. """
    def __init__(self, cnt, addr=None):
        """ Construtor da classe. """
        self.id = cnt
        self.addr = addr
        self.msg_cnt = 0

    def process(self, msg=b""):
        data = json.loads(msg)
       
        if not 'msg' in data or not 'h' in data:
         raise ValueError('Error Message')
        encrypted_msg_b64 = data['msg']
        encrypted_msg = base64.b64decode(encrypted_msg_b64) 

        cipher = AES.new(key, AES.MODE_CTR, nonce=nonce)
        dec_msg = cipher.decrypt(encrypted_msg) 
        h =hashlib.sha256(dec_msg).hexdigest()
        if h != data['h']: raise ValueError('Error Message')
        print(dec_msg)
        self.msg_cnt += 1

        print('Ciphertext %d : %r' % (self.id,data["msg"]))
        print(f'Plaintext:',dec_msg)
    
        return msg


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
