from scapy.all import *
def print_pkt(pkt):
    pkt.show()
pkt = sniff(iface='eth', filter='icmp', prn=print_pkt)