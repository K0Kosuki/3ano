# Código baseado em https://docs.python.org/3.6/library/asyncio-stream.html#tcp-echo-client-using-streams
import asyncio

from cryptography.hazmat.primitives import hashes, serialization
from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.hazmat.primitives.kdf.pbkdf2 import PBKDF2HMAC

import base64
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad

import os

conn_port = 7777
max_msg_size = 9999

class Client:
    """ Classe que implementa a funcionalidade de um CLIENTE. """
    def __init__(self, sckt=None):
        """ Construtor da classe. """
        self.sckt = sckt
        self.msg_cnt = 0
        
        self.salt:bytes = b''
        
    def process(self, msg=b""):
        """ Processa uma mensagem (`bytestring`) enviada pelo SERVIDOR.
            Retorna a mensagem a transmitir como resposta (`None` para
            finalizar ligação) """
        self.msg_cnt +=1
        match self.msg_cnt:
            case 1:
               
                
                # 第一次通信 会发送b""，没活了 随便发个数据
                    return b"Connecting"
            


            case 2:
                # 第二次通信 会收到 公钥+签名+校验讯息，然后生成对称加密用盐返回给服务器
                pem, signature, random_msg = msg.split(b"---SPLIT---")
                server_public_key = serialization.load_pem_public_key(pem)
                try:
                    server_public_key.verify(
                        signature,
                        random_msg,
                        padding.PSS(
                            mgf=padding.MGF1(hashes.SHA256()),
                            salt_length=padding.PSS.MAX_LENGTH
                        ),
                        hashes.SHA256()
                    )
                except:
                    raise ValueError("Signature verification failed!")
                
                # 生成盐并使用公钥进行加密
                self.salt = os.urandom(16)
                encrypted_salt = server_public_key.encrypt(
                    self.salt,
                    padding.OAEP(
                        mgf=padding.MGF1(algorithm=hashes.SHA256()),
                        algorithm=hashes.SHA256(),
                        label=None
                    )
                )
                return encrypted_salt
            case _:
                # 之后将使用盐派生出的密钥进行对称加解密通讯
                if msg: msg = self.decrypt(msg)
                if isinstance(msg, bytes): msg = msg.decode()
                print(b'Received (%d): %r' % (self.msg_cnt , msg))
                print('Input message to send (empty to finish)')
                new_msg = self.encrypt(input().encode())
                return new_msg if len(new_msg)>0 else None

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
    
    def encrypt(self, msg: str|bytes) -> str:
        if isinstance(msg, str): msg = msg.encode()
        random_bytes = os.urandom(48)
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


async def tcp_echo_client():
    reader, writer = await asyncio.open_connection('127.0.0.1', conn_port)
    addr = writer.get_extra_info('peername')
    client = Client(addr)
    msg = client.process()
    while msg:
        writer.write(msg)
        msg = await reader.read(max_msg_size) #等服务器写完
        if msg :
            msg = client.process(msg) ##客户端处理如果msg不为空
        else:
            break
    writer.write(b'\n')
    print('Socket closed!')
    writer.close()

def run_client():
    loop = asyncio.get_event_loop()
    loop.run_until_complete(tcp_echo_client())


run_client()
