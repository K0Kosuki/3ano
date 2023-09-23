#include<stdio.h>
#include<math.h>
int conta_ocorrencias(int k, int numero[], int N){
    int r=0;
    for (int i = 0; i < N; i++)
    {
        if (numero[i]==k)
        {
           r = r + 1;
        }
           }
return r;
}
int main(){
    int numero;
    int k;
    int N [22];
    int valor[22]={0,1,2,3,4,5,6,5,4,3,2,1,2,3,4,5,6,5,4,3,2,0};
    printf("um numero : ");
    scanf("%d",&k);
    int r=conta_ocorrencias(k,valor,22);
    if (1<k<=6)
    {
        printf("numero %d mostra %d vezes ",k,r);
    }
  
    return 0;
}