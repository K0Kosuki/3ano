#include <stdbool.h>
#include <stdio.h>
int main()
{
bool x, y, nao_x, nao_y;
x = true;
y = false;


nao_x = !x; // completar
nao_y = !y; // completar

printf("O valor da negacao logica de x=%d e' %d\n" ,x,nao_x); 
printf("O valor da negacao logica de y=%d e' %d\n" ,y,nao_y);  

system('pause') ;

return 0;



}