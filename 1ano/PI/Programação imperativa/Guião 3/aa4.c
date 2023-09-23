#include<stdio.h>
#include<stdbool.h>
int main(int argc, char *argv[])
{
unsigned int x         ;
unsigned int y = 1     ;

do
{
printf("um numero\n");
scanf("%i",&x);
}

while (x<5 || x>20);

while (y<=x)
{
printf("-");
y++;
}



return 0;
}