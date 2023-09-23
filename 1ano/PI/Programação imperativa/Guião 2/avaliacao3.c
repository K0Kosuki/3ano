#include<stdio.h>
int main(int argc, char *argv[])

{

int a;   //insira 2 numero
int b;
printf("insira dois numero ");
scanf("%d", &a);
scanf("%d", &b);

printf("V/F que o 1o numero introduzido e' impar: %d\n", (a&1) != 0);
printf("V/F que os dois numero introduzido sao diferentes: %d\n" ,(a | 0x0) != b);



system("pause");

return 0;
}