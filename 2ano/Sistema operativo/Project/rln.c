#include "hf.h"
#include "rln.h"
										//essa funcao é para lê um caractere de um ficheiro descritor é fd
int readchar(int fd){				/* devolve -1 no final do ficheiro */
	
	unsigned char buffer[1];				//array chamado buffer,  e pode guardar um único caractere
	int n = read(fd, buffer, 1);              //ler cada char do ficheiro 


	if(n > 0)
		return buffer[0];                    //se tem as caracter para ler, entao no o caracter ta guardado
	else
		return -1;							//quando foi lido tudo, retona -1
}


ssize_t readln(int fd, char *line, int size){					//esta funcao é para le uma linha interno de ficheiro

	int i = 0;									           // tamaho					
	int c = readchar(fd);								//aqui fomos usar funcao readchar para ler caracter do ficheiro

	while(i < size - 1 && c > 0 &&  c != '\n'){			//uma linha tem que ter 3 condicoes ,size -1 , e tem que ter coisa para ler,e 
														// nao ta no fim do ficheiro.
		
		line[i] = c;									//guardar char na linha
		c = readchar(fd);									
		i++;

	}

	line[i] = 0;                                        //porque linha final é nulo

	if(c < 0){											//chegou fim de ler
		i = -1;
	}
	
	return i;                                            //retorno numero de char
}