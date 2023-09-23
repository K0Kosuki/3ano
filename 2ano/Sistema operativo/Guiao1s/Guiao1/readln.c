#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/types.h>
#include <sys/stat.h>

//devolve -1 em EOF

int readchar(int fd){
	char buffer[1];
	int n = read(fd, buffer, 1);

	if(n > 0)
		return buffer[0];
	else
		return -1;
}

ssize_t readln(int fd, char *line, size_t size){
	int i = 0;
	int c = readchar(fd);

	while(i < size-1 && c > 0 &&  c != '\n'){
		line[i] = c;
		c = readchar(fd);
		i++;
	}
	line[i] = 0;
	return i;

}

int main(int argc, char* argv[])
{
	char line[100];
	readln(0, line, 100);
	printf("linha = %s\n", line);
	int fd = open("exemplo.txt", O_RDONLY);
	readln(fd, line, 100);

}
