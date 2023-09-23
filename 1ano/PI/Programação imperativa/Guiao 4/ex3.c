#include <stdio.h>
#include <stdbool.h>
int main()
{
int x=127;
for(int i=0; i<=x ;i++)
{
 if(48<=i && 57>=i){
         printf("interiros codigo: %d , hexa: %x , char: %c\n",i,i,i);
     }

 if( 65 <=i && i<=90){
     printf("interiros codigo: %d, hexa: %x , char: %c\n",i,i,i);
 }
 
 if( 97 <=i && i<=122){
     printf("interiros codigo: %d, hexa: %x , char: %c\n",i,i,i);
 }

}


return 0;
}