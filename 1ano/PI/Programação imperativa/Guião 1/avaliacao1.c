#include <stdio.h>

int main(int argc, char *argv[])

{
int x;    //stand by
int y; 
int z;

printf("Insira 3 numero intero\n");
scanf("%d\n", &x);
scanf("%d\n", &y);
scanf("%d\n",&z);
int p = y*z; ;
double r = x/y ;

printf("Produto = %i\n",p);  //produto
printf("O resto = %f\n",r);  //resto

system("pause");

return 0;
}