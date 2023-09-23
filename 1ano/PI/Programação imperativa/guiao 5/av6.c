#include <stdio.h>
#include<stdbool.h>
int main(){
    int linha[100];
    int negative[100],positivo[100];
    int neg = 0;
    int pos = 0;
    
    for (int i = 0; i < 100; i++)
    {
        linha[i] =3*i-156;
        
        if (linha[i]>0)
        {
            positivo[pos]= linha[i];
            pos++;
        }
        if(linha[i]<0)
        {
            negative[neg] = linha[i];
            neg++;
        }
    }
    
        printf("negativo : %i",neg);
        printf("positivo : %i",pos);
    
 
}