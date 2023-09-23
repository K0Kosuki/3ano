#include <stdio.h>
struct coordenada {
int x;
int y;
int z;
};

int main(){

struct  coordenada c1 = {0,0,0};
c1.x=4;
c1.y=6;
c1.z=9;

printf("coodenada ; %d\n %d\n %d\n",c1.x,c1.y,c1.z);



return 0;


}