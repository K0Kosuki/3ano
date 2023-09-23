#include <stdio.h>

int main()
{
unsigned int a;            //define variavel//
unsigned int b;
a = 0xB6 ;
b=0x95 ;
unsigned int res1 = a&b     ;  
unsigned int res2 = a|b     ;
unsigned int res3 = ~a      ;

printf("a e b igual %x\n",res1);           
printf("a ou b igual %x\n",res2);
printf("negacao de a %x\n",res3);          //1<---negacao 0000(...) 100  

system("pause");
return 0;

}
