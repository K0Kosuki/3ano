#include <stdio.h>

struct coordenada{
    int x;
    int y;
    int z;
};
struct  caixa
{
    int numero;
    char cor[25];
    struct coordenada local;
    int altura, largura, profundidade;
};

int main(){
    struct  coordenada local = {11,20,2};
    struct caixa cai = {3,"castanho",local,25,40,15};
    printf("%d %i %i %i %i %i %i\n", cai.numero, cai.local.x, cai.local.y, cai.local.z, cai.altura,cai.largura, cai.profundidade);
    for (int i = 0; cai.cor[i]!='\0'; i++)
    {
        printf("%c",cai.cor[i]);
    }
    
}   