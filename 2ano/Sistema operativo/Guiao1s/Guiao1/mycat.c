#include <sys/types.h>
#include <unistd.h>
#include <fcntl.h>
#include <stdlib.h>
#include <stdio.h>

#define MAX 1000

int main(int argc, char* argv[])
{
	int  n;

	char linha[MAX];

	while((n = readln(0, linha, MAX) > 0)){
		write(1, linha, n);
	}

	exit(0);
}