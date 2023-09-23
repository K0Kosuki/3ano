#include <c8051f380.h>

void sdelay(int time)
{

	for (int i = 0; i < time; i++)
	{
		for (int j = 0; j < 10; j++)
			; // delay 1 sec
	}
}

void main()
{

	PCA0MD = 0x00;
	XBR1 = 0x40;

	// para hex valor (0-9)
	char zero_F[] = {0xc0, 0xf9, 0xa4, 0xb0, 0x99, 0x92, 0x82, 0xf8, 0x80, 0x90, 0x88, 0x83, 0xc6, 0xa1, 0x86, 0x8e, 0x7f};

	while (1)
	{
		for (int j = 0; j < 10; j++)
		{
			if (P0_6 == 0)
			{
				for (int i = 0; i < 17; i++)
				{
					P2 = zero_F[i];
					sdelay(1000);
				}
			}
			j=0;
		}
		else if (P0_7 == 0)
		{
			for (int j = 17; j > 0; j--)
			{
				P2 = zero_F[j];
				sdelay(1000);
			}
		}
	}
}
