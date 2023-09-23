#include<stdio.h>

double pares_impares_nulos (int NP, int porta[] , int *pares ,int *impares){
int nulo = 0;
for (int i = 0; i < NP; i++)
{
   if (porta[i] % 2 ==0)
   {
       *pares ++;
   }
   if (porta[i] % 2 != 0)
   {
       *impares ++;
   }

}
return nulo;
}

int main()
{
    int npares =0 ;
    int nimpares = 0;
int numeroPorta[18] ={1,2,4,5,6,8,9,10,11,12,14,15,17,18,19,0,0,0};
int nulo = pares_impares_nulos(18,numeroPorta,&npares,&nimpares);

printf("%d   , %d   ,%d",nulo,npares,nimpares);
return 0;
}