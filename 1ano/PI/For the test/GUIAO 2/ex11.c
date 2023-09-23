#include <stdio.h>

int main(void)
{
    // a=operando, m=mascara
    unsigned char a; 
    unsigned char m;
    unsigned char res;
scanf("%c", &a);
    // VERIFICAR SE POSICAO BIT E' '1' /////////////
    m   = 0x04;   //0000 0100
    res = a & m;
    if (res == 0)
        printf("posicao 6 e'0\n"); 
    else
        printf("posicao 6 nao e'0\n");

    
	return 0;
}