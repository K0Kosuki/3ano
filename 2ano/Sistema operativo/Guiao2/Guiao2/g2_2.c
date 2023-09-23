#include <unistd.h>
#include <sys/wait.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int p;

	p = fork();
	printf("eu: %d , pai: %d\n", getpid(), getppid()); /*igual ao exercício 1*/
	if(p == 0) exit(0);
	printf("filho: %d\n", p); /*pid do processo criado pelo fork*/
	sleep(1);
	exit(0);

}
