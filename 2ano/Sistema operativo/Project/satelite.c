#include "hf.h"
#include "rln.h"
#include "satelite.h"

void analisacoordenadas(int latitude, int longitude, char* dados, int pipe[2])         
{

    struct pixel pixel;                          
    int contador = 0;
    struct coordenada coordenada;
    close(pipe[0]); //fechamos o descritor de leitura    int file = open(dados, O_RDONLY);
    int file = open(dados,O_RDONLY);        //vai abrir e ler ficheriro)
  
    while (read(file, &pixel, sizeof(struct pixel)) > 0) //passsamos para pixel os dados lidos no fichiero representado pelo seu descritor de ficheiro file;
    {
        if ((((pixel.r + pixel.g + pixel.b) / 3) > 100) && (pixel.ir > 200))
        {
            coordenada.latitude = latitude;
            coordenada.longitude = longitude + contador;
            write(pipe[1], &coordenada, sizeof(struct coordenada)); //escreve-se no pipe os valores gaurdados na struct coordenada;
        }
        contador++;
    }
    
}

int pesquisaLote(char* ficheiro, struct coordenada* alarmes, int n)   //ler os dados no pipe
{
    char* token[3];
    int mypipe2[2];
    int filhos = 0;
    int i = 0;
    int coordenc = 0;
    char linha[MAX];
    int tamln;
    int fich = open(ficheiro, O_RDONLY); //abrimos o ficheiro que recebemos nos parametros da função 

    if (pipe(mypipe2) == -1) 
    {
        perror("PIPE deu erro");
    }
    else
    {
        while ((tamln = readln(fich, linha, MAX)) > 0) 
        {
            if (!fork()) // enquantofor for verdadeiro ou seja 1,  significa que estamos no processo
                        // filho  ppois o mesmo retribui 0 que é correpondente a falso, qeu logicamente negado é verdadeiro, fork() == 0(false) ==> !(false) = true 
            {
                token[0] = strtok(linha, " "); //strtok é um funcao dividir uma string em varias substrings
                for (i = 0; token[i] != NULL;)  //1234 5678 ./dados/a00.dat separa 1234  de 5678 do ficheiro  ./dados/a00.dat (ex)
                {

                    i++;
                    token[i] = strtok(NULL, " ");    //NULL no 1 como primeiro parâmetro para que a função continue dividindo a partir do último ponto onde parou.
                }

                int lat = atoi(token[0]); //representa a primeira palavra e converte num inteiro
                int lon = atoi(token[1]); //representa a segunda palavra e converte num inteiro
                analisacoordenadas(lat, lon, token[2], mypipe2); //representa a terceira palavra e analisar o ficheiro ( ./dados/a00.dat)
                _exit(1); //os processos criados pelo fork terminam 
            }
            filhos++; // numero de filhos;
        }
        // todo o ficheiro de texto foi percorrido e todos os ficheiros de dados estão a ser verificados;
        close(mypipe2[1]); // fechar extremo de escrita do pipe;

        //while que lê do pipe
        while (coordenc < n && (read(mypipe2[0], &alarmes[coordenc], sizeof(struct coordenada))))
        {
            coordenc++;
        }
        i = 0;
        while (i < filhos)
        {
            wait(NULL); //o processo pai aguarda que os processos filhos terminem;
            i++;
        }
    }
    return coordenc;
}
