#include <c8051f380.h>
void main(void)
{

   
    PCA0MD = 0x00;
    XBR1 = 0x40;
     int i = 0;

    unsigned char zero_F[] = {0xc0, 0xf9, 0xa4, 0xb0, 0x99, 0x92, 0x82, 0xf8, 0x80, 0x90, 0x88, 0x83, 0xc6, 0xa1, 0x86, 0x8e};

    P2 = 0xC0;

    while (1)
    {
		 P2 = zero_F[i];
        if (P0_7 == 0)
        {
            while (P0_7 == 0)
                ;
            i++;

            if (i > 15)
            {
                i = 0;
            }

           
        }

        if (P0_6 == 0)
        {
            while (P0_6 == 0)
                ;
            i--;

            if (i < 0)
            {

                i = 15;
            }

        }
    }
}