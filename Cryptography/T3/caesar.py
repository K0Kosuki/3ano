alph = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

def encrypt(plaintext,key=3):
    cyphertext = str()

    for i in plaintext.replace(' ',''):
        p = alph.index(i.upper())
        c = (p+key)%26
        cyphertext = cyphertext+alph[c]

    return cyphertext

def decrypt(cyphertext, key=3):
    plaintext = str()

    for i in cyphertext:
        c = alph.index(i)
        p = (c-key)%26
        plaintext = plaintext+alph[p]
    
    return plaintext


if __name__ == '__main__':
    original = input('Write the plaintext\n')
    criptograma = encrypt(original)
    print(f'The ciphertext from  < {original} > is < {criptograma} >')
    print(f'The decryption result is < {decrypt(criptograma)} >')