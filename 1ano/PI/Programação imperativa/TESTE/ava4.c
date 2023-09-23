#include<stdio.h>
#include<stdbool.h>
int main(int argc, char *argv[])

{
unsigned int x         ;
unsigned int y = 1     ;

do 
{
    printf("um numero\n");
    scanf("%d", &x);
}

while (x<5 || x>=20);

for(int i=0; i<=x; i++ )
{
printf("\n"); 

   for (int o= 1; o<=x-i; o++)

  {
     if (i%2==0)
     {
         printf("-");
     }
     else
    {
     printf("*");
    }
  }
}

return 0;
}







