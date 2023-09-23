#include <stdio.h>
#include <stdbool.h>
int main()
{
int i=275;
int c =i/100            ;
int d = (i-205)/10      ;
int u = (i-270)         ;

char centenas = (char)c-'0' ;
char dezenas = (char)d-'0'  ;
char unidades = (char)u-'0' ;

printf("Centenda : %c\n ,dezenas : %c\n unidade : %c\n ",centenas,dezenas,unidades);

//system("pause");
return 0 ;
}
