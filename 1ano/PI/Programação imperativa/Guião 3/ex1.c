#include<stdio.h>

int main()
{
int x,y,maior;


printf("dois numero\n");

scanf("%d",&x);
scanf("%d",&y);
 
int s = x+y;

////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////Verifica qual dos dois é o maior e par impar/////////////////////
//////////////////////////////////////////////////////////////////////////////////////////// 
if (x>y)
{
    maior = x;
    printf("O maior numero entre os dois e' %d\n",x) ;
}

else
{
    maior = y;
    printf("O maior numero entre os dois e' %d\n",y);
}
////////0/////////////////////////maior e par/////////////////////////////
if (maior%2 == 0)
{
    printf("O maior numero: %d e' par\n",maior);
}



/////////////////////////////////////////////////////////////////////////
//////////verifica se a soma dos números 'e impar e informa//////////////
/////////////////////////////////////////////////////////////////////////

if(s%2 == 0)
{
   printf("O soma dos dois numero deu %d e': par\n",s);
   if (s%4 == 0)
    {
        printf("O soma dos dois numero deu %d e' par e multiplo de 4\n,",s);
    }
}
else
{
    printf("O soma dos dois numero deu %d e' :impar\n",s);
    if (s%3 == 0)
    {
        printf("O soma dos dois numero deu %d e' impar e multiplo de 3\n",s);
    }
}




  





system("pause");
return 0 ;
}
