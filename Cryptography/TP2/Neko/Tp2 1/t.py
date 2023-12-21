import hashlib

msg = "123abc"

msghash = hashlib.sha256(msg.encode()).hexdigest()

print(msg)
print("----------\n")
print(msghash)