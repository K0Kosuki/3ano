#include <c8051f380.h>
int reload = -50000;
volatile int aux=0;
void confi()
{
	PCA0MD = 0x00;
    XBR1 = 0x40;
    CLKSEL = 0x03;
    CKCON = 0x02;
    TMOD = 0x01;
	EA=1;
	ET0=1;
	
}
void inicio()
{
    TR0=1;
    TL0=reload;
	TH0=(reload>>8);
}

void timer0_overflow(void) __interrupt(1)
{
    inicio();
 
    aux++;
    
	switch(aux){

		case(21):
		P2_7=!P2_7;
		aux=0;
		break;
	}
}


void main()
{
confi();
inicio();


while (1)
{
    
}

}