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
  RI0=0;
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
	while (!RI0); // aguarda por um byte
	x = SBUF0; // recebe o byte
	RI0=0; // limpa a flag de rececao
	return x;
}



void main (void) {

	unsigned char a;



	configUART0();

	a=33;
	while(1){	
		 a=recebeUART();
		a++;
		enviaUART(a);


}
}