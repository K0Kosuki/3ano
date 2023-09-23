#include "hf.h"
#include "rln.h"

bool go = true;

int main(int argc, char *argv[])
{
    int i = 0, f, aux, saida;
    char line[MAX];
    char *arg[2];

    mkfifo("pipeCS", 0620);

    saida = open("pipeCS", O_RDONLY);

    if (saida == -1)
        perror("Algo não correu bem");
    while (go)//run linha do ficheiro..
    {
        if ((aux = readln(saida, line, MAX)) > 0)
        {
            if (strcmp("stop\n", line) == 0)
            {
                go = false;
            }
            else
            {
                if (!fork())
                {

                    arg[0] = strtok(line, " ");

                    for (i = 0; arg[i] != NULL;)
                    {
                        i++;
                        arg[i] = strtok(NULL, " ");
                    }

                    execl("pesquisa", "pesquisa", arg[0], atoi(arg[1]), NULL);
                    _exit(1);
                }
            }
        }
        wait(NULL);
    }

    return 0;
}