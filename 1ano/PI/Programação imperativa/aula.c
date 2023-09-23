#include<stdio.h>
int main()

{
    int i, numero[10];
    i=0;
    while(i < 10)
    {
        scanf("%d", &numero[i]);
        ++i;
        printf("%d",numero[i]);
        
    }
 
return 0;
}