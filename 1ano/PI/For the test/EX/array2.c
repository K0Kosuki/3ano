
// MODULO 05
// DeclaraÃ§Ã£o de arrays com tamanho implÃ­cito e inicializaÃ§Ã£o parcial

#include <stdio.h>

int main(void)
{
    // Combinar a nÃ£o explicitaÃ§Ã£o do tamanho do array com inicializaÃ§Ã£o parcial.
    // SerÃ¡ possÃ­vel? Qual o tamanho do array?

    char letra_inicial[9] = { [0]='J', [2]='M', [8]='S' };
    unsigned long len;

    len = sizeof(letra_inicial)/sizeof(char);
    printf("TAMANHO DO ARRAY letra_inicial: %lu\n",len);

    for(int n=0;n<len;++n) {
        printf("LETRA_INICIAL_MES[%d]=%c\n",n,letra_inicial[n]);
    }

    // Sim Ã© possÃ­vel, o tamanho do array Ã© igual ao maior Ã­ndice inicializado (8) mais 1.
 
    return 0;
}