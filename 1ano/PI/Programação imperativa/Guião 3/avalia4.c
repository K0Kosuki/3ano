#include<stdio.h>
#include<stdbool.h>
int main(int argc, char *argv[])
{
unsigned int b;
unsigned int i;
printf("numero base : \n");
scanf("%d", &b);

for (int i = b; i <=1; i--);
for(int o =1;o >= i ; i++);
if (i%2 ==0)
{
printf("*");
}
else
{
printf("-");
printf("\n");

}



return 0;
}