#include<stdio.h>
int main()
{
    int x,y,maior,impar;
    printf("dois numero plzzz\n");

    scanf("%d",&x);
    scanf("%d",&y);

    if (x>y)
    {    
       maior = x;
       if(x%2==0)
       {
       printf("O maior numero e' %d e par\n",x);
       }
     else{
         printf("O maior numero e' %d e impar\n",x);
     }
    
    }

    if(y>x)
    {
      maior = y;
      if(y%2==0){
          printf("O maior numero e' %d e par\n",y);
      }
      else{
          printf("O maior numero e' %d e impar\n",y);
      }

    }

    int res = x+y;
    if(res %2 == 0){
       
        printf("O soma dos dois deu %d e' par ",res);
        if (res%4 == 0)
    {
        printf("O soma dos dois numero deu %d e' par e multiplo de 4\n,",res);
    }
    }
    else{
         impar = res;
        printf("O soma dos dois deu %d e' impar ",res);
    
    if(impar %3 ==0)
        {
        printf("O soma dos dois numero deu %d e' impar e multiplo de 3\n",impar);
    }
        
    }
return 0;
}