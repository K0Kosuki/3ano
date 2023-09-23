#include <stdio.h>

int main()
{
    int N;
    int media;
    do
    {
        printf("numero do aluno : ");
        scanf("%d", &N);
    } while (N<=0);
    
 int nota[N];
 for (int i = 0; i <N; i++)
 {
    printf("nota\n");
    scanf("%d", &nota[i]);
 }
 int melhor=nota[0];
 int pior=nota[0];
 int soma=0;
 for (int i = 0; i <N; ++i){
                if (nota[i] >melhor)
                {
                    melhor = nota[i];
                }
                if (nota[i] <pior)
                {
                    pior = nota[i];
                }
                soma +=nota[i]; 
 }
      media = soma/N;
      printf("MELHOR : %d\n PIOR :%d\n Media: %d\n", melhor,pior,media,media);
}