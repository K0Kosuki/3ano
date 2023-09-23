#include <stdio.h>

int main(void)
{
    unsigned short j, k, m;

    j = 121;
    k = j << 3;
    m = j >> 3;

    printf("             j    k    m\n");
    printf("(decimal) %4d %4d %4d\n", j, k, m);
    printf("(hex)     %4x %4x %4x\n", j, k, m);
   
    return 0;
}