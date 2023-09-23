#include <stdio.h>
int main()
{
    int d;
    printf("QUANDOS DIAS ?\n");
    scanf("%i", &d);
int ano = d/365;
int sema = (d-ano*365)/7;
int dia = d-365*ano-7*sema;
 printf("%d dia correspondem a %d anos, %d semanas e %d,dias.",d,ano,sema,dia);

 return 0;
}