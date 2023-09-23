#include<stdio.h>
#include<stdbool.h>
int main()
{
bool x , y ;    //variavel logico
x = false; 
y = true;

printf("O valor logico de 'x E y' = %d\n", x & y );
printf("O valor logico de 'NAO(x) E y' = %d\n", !x & y );
printf("O valor logico de 'y OU (x E NAO(y))' = %d\n", y||(x & !y) );
printf("O valor logico de 'nao(x ou y) = %d\n", !(x || y) ) ;


system( "pause");
return 0;

}