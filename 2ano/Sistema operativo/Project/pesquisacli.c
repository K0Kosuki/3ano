#include "hf.h"


int main(int argc, char *argv[])
{

    int i = 0, entrada, tam;
    char arg[MAX];
    entrada = open("pipeCS", O_WRONLY);

    for (i = 1; i < argc; i++) // começamos com 1 pq o 0 é o nome do nosso ficheiro
    {

        strcat(arg, argv[i]); // juntamos o nome do ficheiro de texto com o n(junta os argumentos)

        if (i < argc - 1) // enquanto n chegar ao ultimo acrescenta espaços entre os argumentos
            strcat(arg, " ");
    }

    strcat(arg, "\n"); // no fim acrescenta o \n

    tam = strlen(arg);

    write(entrada, arg, tam);

    close(entrada);

    return 0;
}