#include <c8051f380.h>

void delay(int time)  
{
    
    for(int i=0;i<time;i++){
     for (int j=0;j<100;j++);  //delay 1 sec(maybe)
    }
}

void main(void)
{
    int reload = -500;
    PCA0MD = 0x00;
    XBR1 = 0x40;
    CLKSEL |= 0x02;
    CKCON |= 0x02;
    TMOD |= 0x01;
    P2_7 = 0;
    TH0 = reload >> 8;
    TL0 = reload;
    TR0 = 1;
    while (1)
    {
        while (!TF0){
        TF0 = 0;
        P2_7 = !P2_7;
        delay(1000);
        TH0 = reload >> 8;
        TL0 = reload;
        }
    }