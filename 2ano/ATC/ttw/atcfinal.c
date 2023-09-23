#include <c8051f380.h>

// Digitos de 0 a 9 para exibir no display de 7 segmentos
char digits[10] = {0xC0, 0xF9, 0xA4, 0xB0, 0x99, 0x92, 0x82, 0xF8, 0x80, 0x98};

// Valor de recarga para o Timer 0
int reload = -50000;

// Vari�veis para armazenar o contador e os d�gitos unidades e dezenas
unsigned int counter = 0;
char unidades = 0;
char dezenas = 0;

// Vari�veis para armazenar os d�gitos enquanto o contador estiver pausado
char split_unidades = 0;
char split_dezenas = 0;

// Flag para indicar se o contador est� pausado ou n�o
char paused = 0;

// Interrupt Service Routine para o Timer 0
void timer0_ISR(void) __interrupt(1)
{
    // Recarrega o Timer 0
    TH0 = reload >>8;
    TL0 = reload;
    
    // Incrementa o contador
    counter++;
    
    // Verifica se o contador alcan�ou 100
    if (counter == 100)
    {
        // Se sim, reinicia o contador para 0
        counter = 0;
    }
    
    // Atualiza as vari�veis de unidades e dezenas com os d�gitos atuais do contador
    unidades = counter % 10;
    dezenas = counter / 10;
    
    // Se o contador estiver pausado, armazena os d�gitos atuais nas vari�veis tempor�rias
    if (paused)
    {
        split_unidades = unidades;
        split_dezenas = dezenas;
    }
}

// Configura��o do microcontrolador
void config(void)
{
    PCA0MD = 0x00;
    XBR1 = 0x40;
         
    CLKSEL =0x03;          // Clock do sistema = 48 MHz
    CKCON = 0x02;          // Divide o clock do sistema por 48, obtendo uma frequ�ncia de 1 MHz
    TMOD = 0x01;           // Timer 0, modo 1
    
    EA = 1;                // Ativa a utiliza��o de interrupts
    ET0 = 1;               // Ativa o interrupt com o Timer 0
}

// Inicializa o Timer 0
void init_timer0(void)
{
    TR0 = 1;
}

// Para o Timer 0
void stop_timer0(void)
{
    TR0 = 0;
}

int main(void)
{
    // Configura o microcontrolador
    config();
    
    // Loop infinito
    while  (1)  
    {
        // L� o estado dos bot�es
        char button_6 = P0_6;
        char button_7 = P0_7;
        
        // Verifica o estado dos bot�es
        if (button_6 && button_7)
        {
            
			// Se ambos estiverem pressionados, para o contador e exibe o d�gito 0
            stop_timer0();
            P2 = digits[0];
            counter = 0;
            unidades = 0;
            dezenas = 0;
            paused = 0;
        }
        else if (button_7)
        {
            
			// Se apenas o bot�o da porta 0.7 estiver pressionado, inicia o contador
            init_timer0();
            paused = 0;
        }
        else if (button_6)
        {
		
            // Se apenas o bot�o da porta 0.6 estiver pressionado, pausa o contador
            stop_timer0();
            paused = 1;
        }
        
        // Exibe os d�gitos atuais no display de 7 segmentos
        if (!paused)
        {
            // Se o contador n�o estiver pausado, exibe os d�gitos atuais
            if (dezenas != 0)
            {
                P2 = digits[dezenas];
            }
            P2 = digits[unidades];
            P2_7 = !P2_7;
        }
        else
        {
            // Se o contador estiver pausado, exibe os d�gitos armazenados nas vari�veis tempor�rias
            if (split_dezenas != 0)
            {
                P2 = digits[split_dezenas];
            }
            P2 = digits[split_unidades];
            P2_7 = !P2_7;
        }
    }
}

