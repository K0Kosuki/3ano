#include <stdio.h>

int main(int argv, char* argc[]){

	for(int i = 0; i < argv; i++)
		printf("%d:\t%s\n", i, argc[i]);

}
