#include <stdio.h>
int main()
{
    double d1=1.75, d2, d3;
int i1=3, i2=5, i3;
float f1, f2, f3, f4;
d2 = i1 + d1; // (a)
i3 = i1 + 2 * d1; // (b)
f1 = (float)i1 + 2.0 * (float)d1; // (c)
f2 = i1 / i2; // (d)
f3 = (float)i1 / (float)i2; // (d)
f4 = (float)1245152500; // (e)
d3 = (double)1245152500; // (e)
printf("d2 : %d\n i3 :%d\n f1:%f\n f2:%f\n f3:%f\n f4:%f\n d3 :%d\n",d2,i3,f1,f2,f3, f4,d3);

}