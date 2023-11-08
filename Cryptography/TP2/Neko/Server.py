# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio

from cryptography.hazmat.primitives import hashes, serialization
from cryptography.hazmat.primitives.asymmetric import rsa, padding
from cryptography.hazmat.primitives.kdf.pbkdf2 import PBKDF2HMAC

import base64
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad

import os

conn_cnt = 0
conn_port = 7777
max_msg_size = 9999

class ServerWorker(object): #
    """ Classe que implementa a funcionalidade do SERVIDOR. """
    def __init__(self, cnt, addr=None):
        """ Construtor da classe. """
        self.id = cnt
        self.addr = addr
        self.msg_cnt = 0
        
        self.private_key = rsa.generate_private_key(
            public_exponent=65537,
            key_size=1024*4,
        )
        self.public_key = self.private_key.public_key()
        
        self.salt:bytes = None
        
    def process(self, msg:bytes):
        """ Processa uma mensagem (`bytestring`) enviada pelo CLIENTE.
            Retorna a mensagem a transmitir como resposta (`None` para
            finalizar ligação) """
        self.msg_cnt += 1
        
        match self.msg_cnt:
            case 1:
                # 第一次通信 发送公钥+签名+校验讯息
                random_msg = os.urandom(16)
                signature = self.private_key.sign(
                    random_msg,
                    padding.PSS(##填充和签名方式
                        mgf=padding.MGF1(hashes.SHA256()),##填充完成后签名会SHA256
                        salt_length=padding.PSS.MAX_LENGTH
                    ),
                    hashes.SHA256()
                )
                pem = self.public_key.public_bytes(
                    encoding=serialization.Encoding.PEM,
                    format=serialization.PublicFormat.SubjectPublicKeyInfo
                )
                return pem + b"---SPLIT---" + signature + b"---SPLIT---" + random_msg
            case 2:
                # 第二次通信 会收到客户端发来的公钥加密的盐 通过私钥进行解密获取盐
                encrypted_salt = msg
                self.salt = self.private_key.decrypt(
                    encrypted_salt,
                    padding.OAEP(
                        mgf=padding.MGF1(algorithm=hashes.SHA256()),
                        algorithm=hashes.SHA256(),
                        label=None
                    )
                )
                data = b"Connect Sucess"
                return self.encrypt(data)
            case _:
                # 之后将使用盐派生出的密钥进行对称加解密通讯
                print('Ciphertext %d : %r' % (self.id,msg.decode()))
                result = self.decrypt(msg)
                print(f'Plaintext: {result}')
                return msg if len(msg)>0 else None
            
    def decrypt(self, msg:str|bytes) -> str:
        if isinstance(msg, bytes): msg = msg.decode()
        msg = base64.b64decode(msg)
        password = msg[:48]
        iv = password[:16]
        key = PBKDF2HMAC(
            algorithm=hashes.SHA256(),
            length = 32,
            salt=self.salt,
            iterations = 1000
        ).derive(password[16:])
        encrypt_data = msg[48:]
        cipher = AES.new(key, AES.MODE_CBC, iv)
        decrypt_data = unpad(cipher.decrypt(encrypt_data), AES.block_size)
        return decrypt_data.decode()
    
    def encrypt(self, msg: str|bytes) -> str:   #字符转字节
        if isinstance(msg, str): msg = msg.encode()
        random_bytes = os.urandom(48)   # random
        iv = random_bytes[:16]
        key = PBKDF2HMAC(
            algorithm=hashes.SHA256(),
            length = 32,
            salt=self.salt,
            iterations = 1000
        ).derive(random_bytes[16:])
        cipher = AES.new(key, AES.MODE_CBC, iv)
        encrypt_data = random_bytes + cipher.encrypt(pad(msg, AES.block_size))
        return base64.b64encode(encrypt_data)

#
#
# Funcionalidade Cliente/Servidor
#
# obs: não deverá ser necessário alterar o que se segue
#


async def handle_echo(reader, writer):  #asyncio调用这个函数,strat server时候传入2变量（read,write）
    global conn_cnt
    conn_cnt +=1
    
    addr = writer.get_extra_info('peername') #
    srvwrk = ServerWorker(conn_cnt, addr)
    data = await reader.read(max_msg_size) #等待客户端发送短信
    while True:
        if not data: continue
        if data[:1]==b'\n': break #如果data读取的数据第1位为换行符，结束循环
        data = srvwrk.process(data) #处理后返回数据
        if not data: break
        writer.write(data)
        await writer.drain()
        data = await reader.read(max_msg_size)
    print("[%d]" % srvwrk.id)
    writer.close()


def run_server():
    loop = asyncio.get_event_loop()
    coro = asyncio.start_server(handle_echo, '127.0.0.1', conn_port)
    server = loop.run_until_complete(coro) #无限循环服务器
    # Serve requests until Ctrl+C is pressed
    print('Serving on {}'.format(server.sockets[0].getsockname())) #scokets 服务器
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
