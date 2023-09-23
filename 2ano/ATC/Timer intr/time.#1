#include <c8051f380.h>
volatile char c = 0;
void config()
{

    PCA0MD = 0x00;
    XBR1 = 0x40;

    CLKSEL = 0X03; //
    CKCON = 0x02;  // divide por 48 assim T =1us
    TMOD = 0x10;   // TIME1 16bit manuelmente
    IE = 0X88;
    TR1 = 1;
    TH1 = (-50000) >> 8;
    TL1 = -50000;
}

void interrput()
{
    
    if (c == 20)
    {
        P2_7 =!P2_7;
        c = 0;
    }
    TH1 = (-50000) >> 8;
    TL1 = -50000;
	c++;
}

void main()
{
    config();
    while (1)
        ;
}