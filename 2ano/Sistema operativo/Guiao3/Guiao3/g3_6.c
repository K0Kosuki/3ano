#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <string.h>

int mysystem(char* cmd){

	char* args[100];	// Último elemento deve ser NULL
	int i = 0;

	// partir a string com o strtok
	args[0] = strtok(cmd, " ");

	while(args[i] != NULL){
		i++;
		args[i] = strtok(NULL, " ");
	}

	if(fork() == 0){

		execvp(args[0], args);
		perror(args[0]);
		_exit(1);

	}else{

		int status;
		wait(&status);
		if(WIFEXITED(status))
			return WIFEXITED(status);

	}

	return -1;
}

int main(int argc, char* argv[]){

	system("ls -l");

	char cmd[] = "ls -l";

	mysystem(cmd);
//	mysystem("ls -l -a");

}
