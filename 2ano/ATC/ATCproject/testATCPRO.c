#include <c8051f380.h>
__xdata char sequencia[16] = {0xc0, 0xf9, 0xa4, 0xb0, 0x99, 0x92, 0x82, 0xf8, 0x80, 0x90, 0x88, 0x83, 0xc6, 0xa1, 0x86, 0x8e};
volatile int index1 = 0;
volatile int aux = 0;

void config_sys0()
{

    PCA0MD = 0x00; // Desliga watchdog
    XBR1 = 0x40;   // Ativa crossbar

    TMOD |= 0X11;   // timer 16 bits sem autoreload ;
    CLKSEL |= 0x03; // deixa a freqeuncia de clocc como está defnido (48 Mhz);
    CKCON |= 0X02;  // frequencia a dividir por 48 ----> ou seja a frequencia está a 1Mhz;
    TL0 = 15536;
    TH0 = 15536 >> 8;
    ET0 = 1;
    EA = 1;
    TR0 = 1;
    TR1 = 1;
}

void onesecond(int a)
{ // o a é uma variável que controla quantos segundos queremos de delay!
    for (int l = a; l <= 20; l++)
    {
        while (TF0 != 1)
            ;
        TF0 = 0;
        TL0 = 15536;
        TH0 = 15536 >> 8;
    }
}

void timer0_overflow(void) __interrupt(1)
{
    if (index1 < 9)
    {
        if (aux == 20)
        {
            aux = 0;
            index1++;
        }
        else
            aux++;
    }
    else if (index1 > 9)
    {
        index1 = 0;
        if (aux == 10)
        {
            aux = 0;
            index1++;
        }
        else
        {
            aux++;
        }
    }
}

void mostra()
{
   for (int c = 0; c < 10; c++)
    {
        for (int d = 0; d < 10; d++)
        {
            for (int u = 0; u < 10; u++)
            {
                if (c == 0 && d == 0)
                {
                    P2=sequencia[u];
                    onesecond(1);
                }
                else if (c == 0 && d > 0)
                {
                    P2=sequencia[d];
                    onesecond(12);
                    P2=0xFF;
                    onesecond(18);
                    P2=sequencia[u];
                    onesecond(12);
                    P2=0xFF;
                    onesecond(18);

                }
                else if (c > 0 && d > 0)
                {
                    P2= 0xFF;
                    onesecond(18);
                    P2=sequencia[c];
                    onesecond(16);
                    P2= 0xFF;
                    onesecond(18)
                    P2=sequencia[d];
                    onsecond(16);
                    P2= 0xFF;
                    onesecond(18)
                    P2=sequencia[u];
                    onsecond(18);
                }
            }
        }
    }
 }


int main(void)
{
    config_sys0();
    while (1)
    {
	mostra();
    }
}