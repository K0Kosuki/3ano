#include <c8051f380.h>

void main(void)
{

    PCA0MD = 0x00;
    XBR1 = 0x40;

    int reload = -1000000; // falta 1000000 ciclos para FFFF
    CKCON |= 0x02;         // Divide o clock por 48 => T=1us
    TMOD |= 0x01;          // Modo 16 bits
    TH0 = reload >> 8;     // Inicializa o registo de contagem
    TL0 = reload;
    TR0 = 1; // Ativa a contagem

    while (1)

    {
        while (TF0 == 0)
            ; // Aguarda fim da contagem
        TF0 = 0;
        P2_7 = !P2_7;      // Complementa o pino do porto
        TH0 = reload >> 8; // Inicializa o registo de contagem
        TL0 = reload;
    }
}