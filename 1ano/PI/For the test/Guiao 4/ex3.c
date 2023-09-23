#include<stdio.h>
#include<stdbool.h>
int main()
{
    int x =127;
    int i=0;
    while (i<=x && i>=0)
    {
        if(48<=i && 57>=i)
        printf("interiros codigo: %d , hexa: %x , char: %c\n",i,i,i);

        if (65<=i && 90>=i)
        {
            printf("interiros codigo: %d , hexa: %x , char: %c\n",i,i,i);
        }
        
        if( 97 <=i && i<=122)
        {
     printf("interiros codigo: %d, hexa: %x , char: %c\n",i,i,i);
        }
i++;
    }
    
}