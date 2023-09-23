#include <stdio.h>
#include <stdbool.h>
int main(int argc, char *argv[])

{
unsigned int x;
unsigned int y=0;
do
{
printf("um numero\n");
scanf("%i",&x);
}

while (x<10 || x>50);

while (y<=x)
{
printf("-");
y++;
}

system("pause");
return 0;   

}