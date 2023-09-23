#include <stdio.h>

int main()
{
    short int x=5;
    short int y=512;
    short int z=71;
    short int r1, r2, r3, r4, r5,r6,r7,r8;
    r1= x/4; r2=x/8; r3=x/16;
    r4=y/2; r5=y/4; r6=y/8;
    r7=z/4; r8=z/8; 
    printf("%hd,%hd,%hd\n,%hd,%hd,%hd\n,%hd,%hd",r1,r2,r3,r4,r5,r6,r7,r8);
}