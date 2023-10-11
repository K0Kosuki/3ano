from scapy.all import *
def print_pkt(pkt):
        pkt.show()
pkt = sniff(iface='Wi-Fi',filter='tcp dst port 80',prn=print_pkt)
wrpcap('./tcp80HostSCANME.pcap',pkt)



