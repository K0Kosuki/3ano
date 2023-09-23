#include <stdio.h>
#include <stdbool.h>
int main()
{
    int x;
    printf("um numero entre 5 e 15\n");
    scanf("%d", &x);
    for (int i = 1; i <=x ; i++)
    {
        printf("\n");
        for(int j=0;j<i;j++){
            printf("*");
            
            }
        


    }
   

}