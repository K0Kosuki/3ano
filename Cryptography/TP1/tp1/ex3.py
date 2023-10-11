from scapy.all import *

a = IP(src='312.31.1.56')
a.dst = '8.8.8.8'
b = ICMP()
p = a/b
sendp(p)

