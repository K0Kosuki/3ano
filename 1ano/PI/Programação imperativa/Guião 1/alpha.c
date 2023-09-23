#include <stdio.h>

int main(void)
{
	char  c = 'a';
	int   i = 9999;
	float f = 3.1415926535897932;
	printf("c = %c (%o em octal)\n", c, c);
	printf("i = %6d (%x em hexadecimal)\n", i, i);
	printf("f = %8.5f (%e em notacao cientifica)\n", f, f);
system("pause");
}