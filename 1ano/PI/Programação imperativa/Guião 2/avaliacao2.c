#include <stdio.h>
#include <stdbool.h>
int main(int argc, char *argv[])

{
int x ;                                 //idade x
int y ;                                 //idade y  


printf("Insira duas idades \n");

scanf("%d", &x);
scanf("%d", &y);                                 // duas idade

printf("V/F que a primera idade e' menor que a segunda: %d\n", x < y);
printf("V/F que o resto da divisao da primeira idade pela segunda e' diferente de 0 :%d\n",(x%y) != 0);
printf("V/F que ambas as idades nao maiores ou igual a 18 : %d\n", x&&y >= 18); 
printf("o resultado da multiplicacao das duas idade igual :%d e o valor booleano igual ser multiplo de 5: %d\n", x*y , (x*y)%5==0 );


system("pause");

return 0;

}