#include <stdbool.h>
#include <stdio.h>
int main(void)
{
    int N,media=0;
    printf("Número de alunos:");
    scanf("%i", &N);
    int nota[N];
    int maior = nota[0];
    int menor = nota[0];
    for (int i = 0; i <= N; i++)
    {
        printf("NOTA:");
        scanf("%i", nota[i]);
        if (nota[i] > maior)
        {
            maior = nota[i];
        }
        if (nota[i] < menor)
        {
            menor = nota[i];
        }
        media=nota[i]+media;

    }
    printf("A melhor nota é: %i", maior);
    printf("A pior nota é: %i", menor);
    printf("A média é %d",(media*1.0)/ N);
}