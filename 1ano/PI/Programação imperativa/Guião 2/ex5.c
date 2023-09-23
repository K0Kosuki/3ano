#include <stdio.h>
#include <stdbool.h>
int main()

{
int v1 = 31;              //define variavel//
int v2 = 30;
int v3 = 35;
int v4 = 30;

printf("Verdade ou falso que v1 e' diferente de v2: %d\n",v1 != v2);
printf("Verdade ou falso que v2 e' igual a v4: %d\n", v2 == v4); 
printf("Verdade ou falso que v1 e' maior do que v3: %d\n", v1 > v3); 
printf("Verdade ou falso que v1 e' menor ou igual a v4: %d\n", v1 <= v4); 
printf("Verdade ou falso que v1 e' menor que v3 E maior que v4: %d\n", v3> v1 &v1 < v4);

system("pause");



return 0;




}