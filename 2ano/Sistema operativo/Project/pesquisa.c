#include "hf.h"
#include "satelite.h"

int main(int argc, char *argv[])
{

    int n = atoi(argv[2]);
    struct coordenada alarmes[n];
    int coordenc = 0;
    int mypipe1[2];
    coordenc = pesquisaLote(argv[1], alarmes, n);
    int i;

    if (pipe(mypipe1) == -1)
    {
        perror("Não funcionou!");
    }
    else
    {
        if (!fork())                    //maximo 5
        {-
            close(mypipe1[1]);   //função dup2() é usada para duplicar uma descrição de fichiero.
            //então os dados lidos a partir do pipe serão lidos como se fossem lidos do standard input. 
            dup2(mypipe1[0], 0); // copiar o 1 argumento para o lugar do 2 e de seguida fechar o 1 argumento
            close(mypipe1[0]);   
            execl("mail.sh","mail.sh","bombeiros@protecao-civil.pt",NULL);
            _exit(1);
        }
        else
        {
            close(mypipe1[0]);
            for (i = 0; i < coordenc; i++)
            {
                write(mypipe1[1], &alarmes[i], sizeof(struct coordenada));
                printf("pesquisa.c leu: alarmes[%d] -> lat:%d    lon:%d\n", i, alarmes[i].latitude, alarmes[i].longitude);
            }
            close(mypipe1[1]);
        }
    }
    return 0;
}