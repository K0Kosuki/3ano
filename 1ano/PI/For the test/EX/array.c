
// MODULO 05
// DeclaraÃ§Ã£o de arrays com tamanho explÃ­cito e inicializaÃ§Ã£o total

#include <stdio.h>

int main(void)
{
    int   dias_mes[12]      = {31,28,31,30,31,30,31,31,30,31,30,31, 88, 99}; // DOIS A MAIS
    char  letra_inicial[12] = {'J','F','M','A','M','J','J','A','S','O','N','D'};
    float mm_chuva[12]      = {3.5,3.7,3.8,2.6,3.9,3.7,4.0,4.0,3.2,2.9,3.0,3.2};

    printf("TAMANHO DO ARRAY dias_mes: %lu\n",sizeof(dias_mes)/sizeof(int));

    for(int n=0;n<12;++n) {
        printf("DIAS_MES[%c]=%d MM_CHUVA[%c]=%f\n",letra_inicial[n],dias_mes[n],
            letra_inicial[n],mm_chuva[n]);
    }

    return 0;
}