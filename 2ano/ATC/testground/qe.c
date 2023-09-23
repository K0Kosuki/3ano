#include <c8051f380.h>

void main()
{

    PCA0MD = 0x00;
    XBR1 = 0x40;

    int C = 0;
    int reload = 65536 - 1000; // configurar o overflow para fazer 1000 contagens.=> 1000 * 1us =1m
    CKCON |= 0x02;             // IO=48MHz.Divide o clock 48 assim	T= 1/48MHz/48 => T = 1us
    TMOD |= 0x01;              // Modo 16 bits reload manuelmente

    TH0 = reload >> 8; // Inicializa o registo de contagem(um shift 8bit para direta?)
    TL0 = reload;
    TR0 = 1; // Ativa a contagem

    while (1)

    {
        while (TF0 == 0)
            ; // Aguarda fim da contagem
        TF0 = 0;
        C++;
        TH0 = reload >> 8; // Inicializa o registo de contagem
        TL0 = reload;
        if (C == 16) //Cada contagem demota 0.06s,para fazer 1s falta 16 ciclos
        {
            P2_7 = !P2_7;

            C = 0; //Redefini contagem
        }
    }
}