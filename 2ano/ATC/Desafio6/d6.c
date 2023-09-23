#include <c8051f380.h>

void enviaUART(unsigned char x);
void realiza_buffer(char comando);
unsigned char recebeUART();

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

  //Falta configurar as interrupcoes, se necessario

}

void enviaUART(unsigned char x) {
	while (!TI0); // aguarda pelo fim do envio anterior
	TI0=0; // limpa a flg de envio
	SBUF0 = x; // envia o byte
}

unsigned char recebeUART() {
	unsigned char x;
	if(RI0!=0){ // aguarda por um byte
	x = SBUF0;} // recebe o byte
	else{x=-1;}   //se nao recebe nada
	
	RI0=0; // limpa a flag de rececao
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