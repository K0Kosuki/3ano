#include <unistd.h>
#include <sys/wait.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int s, i = 1;

	for(i = 1;  i <= 10; i++)
	{
		if(!fork())
		{
			sleep(1);
			printf("eu: %d , pai: %d\n", getpid(), getppid());
			exit(i);
		}
	}

	for(i = 1;  i <= 10; i++)
	{
		wait(&s);

		if(WIFEXITED(s))
			printf("filho: %d\n", WEXITSTATUS(s));
	}
}
