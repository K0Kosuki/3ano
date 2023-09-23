#include <stdio.h>
#include <stdbool.h>
int main(int argv, char *argc[])
{
    int a, s = 0,l=1,e=1;
    do
    {
        printf("Escolha um número entre 5 e 15\n");
        scanf("%i \n",&a);
    } while ((a < 5) || (a > 15));
    for (int i = 0; i <= a; i++)
    {
        printf("\n");
        s++;
        l++;
        for (int j = 0; j <= a - s; j++)
        {
            while(e<=l){
            print("0");
            e++;
            }
            printf("#");
        }
    }
}