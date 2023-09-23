#include <stdio.h>

int com(int k, int numero[], int N)
{
    int vez = 0;

    for (int i = 0; i < N; i++)
    {

        if (numero[i] > k)
            vez = vez + 1;
    }
    return vez;
}

int main()
{
    int kp;
    int valor[22] = {0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 0};

    printf("um numero\n");
    scanf("%d", &kp);
    

    int r = com(kp, valor, 22);

    printf("exist %d maiores do que %d ",r ,kp);
    return 0;
}