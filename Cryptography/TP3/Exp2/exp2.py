import argparse
from Crypto.Cipher import AES
from Crypto.Hash import SHA256
import os
def hash_key(key):
    hash_key = SHA256.new(key.encode()).digest()  # Usa SHA256 para calc hash da chave
    return hash_key

def encrypt_file(key, input_file, output_file):
    nonce = os.urandom(12)
    cipher = AES.new(key, AES.MODE_GCM,nonce=nonce,)
    

    with open(input_file, 'rb') as f_in:
        plaintext = f_in.read()
        ciphertext, tag = cipher.encrypt_and_digest(plaintext)

    with open(output_file, 'wb') as f_out:
        f_out.write(nonce)
        f_out.write(tag)
        f_out.write(ciphertext)


def decrypt_file(key, input_file, output_file):
    with open(input_file, 'rb') as f_in:
        nonce = f_in.read(12)
        tag = f_in.read(16)
        ciphertext = f_in.read()

        cipher = AES.new(key, AES.MODE_GCM, nonce=nonce)
        plaintext = cipher.decrypt_and_verify(ciphertext, tag)

    with open(output_file, 'wb') as f_out:
        f_out.write(plaintext)

parser = argparse.ArgumentParser()
parser.add_argument('operacao', choices=['cifra', 'decifra'], help='Operação: cifra ou decifra')
parser.add_argument('chave', help='Chave de criptografia (texto)')
parser.add_argument('input_file', help='Arquivo de entrada')
parser.add_argument('output_file', help='Arquivo de saída')
args = parser.parse_args()

try:
    key = hash_key(args.chave)

    if args.operacao == 'cifra':
        encrypt_file(key, args.input_file, args.output_file)
    elif args.operacao == 'decifra':
        decrypt_file(key, args.input_file, args.output_file)
except Exception as e:
    print(f"Erro: {str(e)}")

#para cifra: python exp2.py cifra <chave> <input_file> <output_file>
    
#para decifra: python exp2.py decifra <chave> <input_file> <output_file>
    
#exemplo: python exp2.py cifra/decifra 12345 a.txt b.txt