#include <c8051f380.h>

void enviaUART(unsigned char x);
void realiza_buffer(char comando);
unsigned char recebeUART();
volatile int RxDado = 0; //Sem dados de RX
volatile int TxDado = 1; //Disponivel p/ TX
volatile unsigned char dado = 0;


void configUART0(void) {


  PCA0MD = 0x00;  //Desliga watchdog  	 
  XBR0 |= 0x01;  //Ativa UART0 no crossbar
  XBR1 = 0x40;     //Ativa crossbar
  

  CLKSEL |= 0x02;   //SYSCLK derivado do Oscil/2=24MHz

 // P0MDOUT |= 0x10;   //Ativa Push-pull no pino TX (recomendado)
  //tx =p0_4
  //rx =p0_5

//Configurar timer1

  //Segundo a tabela 22.1 do manual do micro (SYSCLK=24MHz)

  CKCON |= 0x08;  //T1M=1 >> 115200bps. Comentar p/ 9600bps

  TH1 = 0x98;  //Valor de autorelaod p/ 115200 e 9600

  //Selecao e ativacao do timer

  TMOD |= 0x20;  //Timer1, modo2 (autorelaod)

  TR1 = 1;  //TCON |=0x40 >> Ativa timer

//Configurar porta serie (SCON)

  TI0=1;
  
  REN0 = 1;  //SCON0 |=0x10 >> Ativa rececao
  
  EA=1;
  ES0=1;
  ET1=1;

}


void inter (void) __interrupt (4) {
if (RI0) { // acabou de receber
RI0 = 0; // limpa a flg de recepcao
RxDado = 1;
dado = SBUF0; // recebe o byte
}
if (TI0) {
TI0 = 0;
if (TxDado){ // TI foi ativado manualmente
SBUF0 = dado;
TxDado = 0;
}// A enviar...
else{ // Acabou de enviar
TxDado = 1;}
}

}






void enviaUART(unsigned char x) {
	while (!TxDado); // aguarda pelo fim do envio anterior
	dado=x;
    TxDado =1;
	TI0=1;
}

unsigned char recebeUART() {
	unsigned char x;
	if(RxDado){ 
	x = dado;
	RxDado=0;
	} 
	else{x=-1;} 
	
	return x;
}




void main (void) {
	unsigned int c=0;
    unsigned char a;


  char sequencia[16]={0xc0, 0xf9, 0xa4, 0xb0, 0x99, 0x92, 0x82, 0xf8, 0x80, 0x90, 0x88, 0x83, 0xc6, 0xa1, 0x86, 0x8e};
    configUART0();
  int trans[16]={48,49,50,51,52,53,54,55,56,57,65,66,67,68,69,70};

P2 = 0xc0;
    while(1){
    a=recebeUART();
	
    switch(a){
     case 'i': 
	 c++;
	 enviaUART(trans[c&0x0f]);
      P2 = sequencia[c&0x0f]; 
	  
      
    
      break;
      
	  case 'd': 
      c--;
      P2 = sequencia[c&0x0f];
      enviaUART(trans[c&0x0f]);
      break;
     }





P2 = sequencia[c&0x0f];
if (P0_7 == 0)
        {
            while (P0_7 == 0)
                ;
            c++;
           
        }

        if (P0_6 == 0)
        {
            while (P0_6 == 0)
                ;
            c--;

        }  
  }
}