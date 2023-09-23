#include <c8051f380.h>

#define Inicio 0
#define Contagem 1
#define Parado 2
#define Split 3


const char sequencia[] = {0xc0, 0xf9, 0xa4, 0xb0, 0x99, 0x92, 0x82, 0xf8, 0x80, 0x90};
volatile unsigned int d = 0, u = 1,U,D, aux = 0,aux1=0,estado,split =0;


void iniciar_sysclock(void)
{
    PCA0MD = 0x00; // xbar and watchdog
    XBR1 = 0x40;
}

void iniciar_timer(void)
{
    CLKSEL = 0x03; //clock da sistema
    CKCON = 0x02;   //  f=1MHZ   T=1ms
    TMOD = 0x11;  //timer0 time1 16bit sem autoreload
    TR0 = 0;
    TR1 = 0;
}

void iniciar_interrupcoes()
{
    IE = 0x8A;
}

void iniciar_timer0(void)
{	
	TR0=1;
    TL0 = -50000;                   
    TH0 = (-50000 >> 8);
}

void iniciar_timer1(){

    TR1=1;
    TL1 = -50000;
    TH1 = (-50000 >> 8);
}

void timer1_overflow(void) __interrupt(3)
{
    aux1++;
    iniciar_timer1();
    switch (aux1)
    {
        case (1):
            P2 = 0xFF;
            break;

        case (3):
            P2 = sequencia[D];
            break;

		case (11):
			 P2 = 0xFF;
			break;

        case (13):

            P2 = sequencia[U-1];
			P2_7=0;
            break;

		case (21):
		 aux1 =0;
     }
}

void timer0_overflow(void) __interrupt(1)
{
    aux++;
    iniciar_timer0();

	switch (aux)
    {
        case (1):
			if(!split)P2 = 0xFF;
            break;

        case (3):
            if(!split)P2 = sequencia[d];
			
            break;

		case (11):
			 if(!split)P2 = 0xFF;

			break;

        case (13):

            if(!split)P2 = sequencia[u];
			if(!split)P2_7 =0;
            u++;
            if (u == 10)
            {
                u = 0;
                d++;
                if (d == 10)
                    d = 0;
            }
            break;

		case (21):
		 	aux =0;
			break;
     }
}
		

void start(){
    if(P0_6==0){
		while(P0_6==0);
		iniciar_timer0();
		estado =1;
    }
}

void reset(){
	if(P0_7 == 0){
		while(P0_7==0);
		TR1=0;
		TR0=0;
		aux=0;
		aux1=0;
		u=1;
		d=0;
		P2 = sequencia[d];
		estado=0;
	}
}

void split_on(){
    if(P0_7 == 0){
		while(P0_7==0);
        U=u;
		D=d;
		estado =3;
		split++;
        iniciar_timer1();
    }
}

void split_off(){
    if(P0_7 == 0){
		while(P0_7==0);
        TR1=0;
		split--;
		U=0;
		D=0;
		estado=1;
        iniciar_timer0();
}
}

void stop_on(){
	if( P0_6==0){
        while(P0_6==0);
		U=u;
		D=d;
        TR0 =0;
		estado = 2;
        iniciar_timer1();
    }
}

void stop_off(){
	if(P0_6==0){
		while(P0_6 ==0);
		U=0;
		D=0;
		TR1=0;
		aux1=0;
		estado =1;
        iniciar_timer0();
		}
}

void main()
{

    iniciar_sysclock();
    iniciar_timer();
    iniciar_interrupcoes();
    TR0=0;
	TR1=0;
	estado = Inicio;
	P2 = sequencia[0];
    while (1){
	switch(estado){
	
	case (Inicio)://inicio
		start();

		break;
	case (Contagem): //contagem

		stop_on();
        split_on();
		break;
	case (Parado): //paragem

        reset();
		stop_off();

		break;

    case (Split): 
        split_off();
		}
	}
}
	