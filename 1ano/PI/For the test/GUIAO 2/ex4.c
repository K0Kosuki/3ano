#include <stdio.h>
int main()
{
int x=6, y=3, z;
x-- ;
++y ;
// Quais os valores de x e de y?
z = x-- + y++ ; 
printf("%d,%d,%d\n",x,y,z);
// Quais os valores de x, y e z?
z = 2*x-- + 3*y++ ;
printf("%d,%d,%d\n",x,y,z);
// Quais os valores de x, y e z?
z = --x - ++y ;
printf("%d,%d,%d\n",x,y,z);
// Quais os valores de x, y e z?
z = --x * 3 + ++y * 4;
printf("%d,%d,%d\n",x,y,z);
// Quais os valores de x, y e z?

return 0;
}