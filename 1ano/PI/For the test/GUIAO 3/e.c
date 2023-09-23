#include <stdio.h>
#include <stdbool.h>
int main()
{
    int x;
    int l = 2;
    printf("entre 5 - 15 \n");
    scanf("%d", &x);

    for (int i = 0; i <= x; i++)
    {
        ++l;
        for (int j = 1; j <= x - i; j++)
        {
            if(l>=1 && l<=j)
            {
                printf(" ");
            }
        }

        printf("#");
    }
    printf("\n");
}
