#include <stdio.h>
#include <stdbool.h>
struct coordenada
{
    int x;
    int y;
    int z;
};

struct caixa
{
    int numero;
    char cor[25];
    struct coordenada local;
    int altura;
    int largura;
    int profundidade;
};

int main()
{
    struct coordenada local = {11, 20, 2};
    struct caixa c = {3, "castanho", local, 25, 40, 15};
    printf("\n%i,\n%i,\n%i,\n%i,\n%i,\n%i,\n%i\n", c.numero, c.local.x, c.local.y, c.local.z, c.altura, c.largura, c.profundidade);
    for (int i = 0; i < 25; i++)
    {
        printf("%c", c.cor[i]);
    }
}