#include <stdio.h>
#include <stdbool.h>
int main()
{
char centenas ='5'   ;
char dezenas = '8'    ;
char unidades = '3'   ;

int c =(int)centenas-'0' ;
int d = (int)dezenas-'0' ;
int u = (int)unidades-'0' ;

int x = c * 100;
int y = d * 10;
int z = u * 1;
int num = (x+y+z);

printf("%i",num);

return 0;
}