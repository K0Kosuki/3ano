#include<stdio.h>
int main()
{
    int N;
    
   
    printf("Numero do aluno\n");
    scanf("%d", &N);

    int nota[N];
    int maior = 0;
    int pior =20;
    int soma=0;
    for (int i=0; i < N; i++)
    {

        printf("As notas :");
        scanf("%d", &nota[i]);
        soma=soma+nota[i];
        if(nota[i] > maior)
        { 
            maior = nota[i];
        }
            if (nota[i]<pior)
            {
                pior = nota[i];
            }
                
                

}
int media = soma/N;
printf("maior: %d\n  pior: %d \n media : %d\n", maior,pior,media);
}