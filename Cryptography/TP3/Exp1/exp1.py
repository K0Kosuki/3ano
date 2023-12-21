import hashlib

# fichiero
file_path = './cod.txt'
# hash do cod
orig_hash = '96cae35ce8a9b0244178bf28e4966c2ce1b8385723a96a6b838858cdd6ca0a1e'

def read_from_file(file_path, orig_hash):
    with open(file_path, 'r') as file:
        for line in file:
            line = line.strip()
            passhash = hashlib.sha256(line.encode()).hexdigest()
            if passhash == orig_hash:
                return line  # Return linha se encontrou 
    return None  # Return None se não existe

found_cod = read_from_file(file_path, orig_hash)

print(found_cod) 