#include <stdio.h>

int main(void)
{
    // a=operando, m=mÃ¡scara
    unsigned char a; 
    unsigned char m;
    unsigned char res;

    // VERIFICAR SE TODOS OS BITS DE a SAO '1' /////////////

    a   = 0x3a; // 0011 1010 = 3A
    m   = 0xFF;
    res = a & m;
    if (res == m)
        printf("Todos os bits de a=%2x sao 1\n", a, res); // %2x - escreve valores com 2 espaÃ§os
    else
        printf("Algum dos bits de a=%2x nao e' 1\n", a, res);

    a   = 255; // 1111 1111 = FF
    m   = 0xFF;
    res = a & m;
    if (res == m)
        printf("Todos os bits de a=%2x sao 1\n", a, res);
    else
        printf("Algum dos bits de a=%2x nao e' 1\n", a, res);

    // VERIFICAR SE OS BITS 1 e 0 DE a SAO '1' /////////////

    a   = 0x3a; // 0011 1010 = 3A
    m   = 0x03;
    res = a & m;
    if (res == m)
        printf("Os bits 1:0 de a=%2x sao 1\n", a, res);
    else
        printf("Algum dos bits 1:0 de a=%2x nao e' 1\n", a, res);

	return 0;
}