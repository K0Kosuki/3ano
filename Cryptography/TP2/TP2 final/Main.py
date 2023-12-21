import subprocess

def run_client(client_script, server_script):

    server = subprocess.Popen(['python', server_script])
    client = subprocess.Popen(['python', client_script])

    client.wait()
    server.terminate()
def main():
    clients_servers = {
        "1": ("Client_sha256.py", "Server_sha256.py"),
        "2": ("Client_aes.py", "Server_aes.py"),
        "3": ("Client_sigt.py", "Server_sig.py")
    
    }

    print("Escolha modo de segurança:\n")
    print("1- Integridade\n")
    print("2- Confidencialidade e Integridade\n")
    print("3- Confidencialidade, Integridade e autenticidade\n")

    choice = input("opção: ")

    if choice in clients_servers:
        run_client(*clients_servers[choice])
    else:
        print("Invalido opção.")

if __name__ == "__main__":
    main()
