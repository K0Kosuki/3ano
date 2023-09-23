#include <unistd.h>
#include <sys/wait.h>
#include <stdio.h>

int main()
{
	printf("eu: %d , pai: %d\n",getpid(), getppid()); /*eu -> proceso do programa  |  pai -> processo do terminal*/

	sleep(10);
}
