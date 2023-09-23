#include <c8051f380.h>


void sdelay(int time)
    {

        for (int i = 0; i < time; i++)
        {
            for (int j = 0; j < 100; j++); // delay 1 sec
        }
    }




void main()
{

    PCA0MD = 0x00;
    XBR1 = 0x40;

    

    // para hex valor (0-9)
    char zero_nine[] = {0xc0, 0xf9, 0xa4, 0xb0, 0x99, 0x92, 0x82, 0xf8, 0x80, 0x90};

    while (1)
    {
        P2 = 0xC0;
        if (P0_7 == 0)
        {
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j <= 10; j++)
                {
                    if (j < 10)
                    {
                        P2 = zero_nine[j];
                        sdelay(1000);
                    }
                    else
                    {
                        P2 = zero_nine[i + 1];
                        sdelay(500);
                    }
                }
            }
        }
        else
            P2 = 0xFF;
    }
	}