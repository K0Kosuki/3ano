#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main(int argc, char* argv[]){

	printf("Antes\n");

	if(fork()==0){
		execlp("ls", "ls", NULL);
		perror("ls");
		_exit(1);
	}else{
		wait(NULL);
	}

	printf("Depois\n");
}
