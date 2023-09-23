#include <stdio.h>
int main()
{
int i;
char c;
short s;
long long lo;
float f;
double d;
long double ld;

size_t x,y,z,t1,t2,t3,t4 ;

x = sizeof(i);
y = sizeof (c);
z = sizeof(s);
t1 = sizeof(lo);
t2 = sizeof(f);
t3 = sizeof(d);
t4 = sizeof(ld);

printf("size of int e' %lu \n",x);
printf("size of char e' %lu \n",y);
printf("size of short e' %lu \n",z);
printf("size of long long e' %lu \n",t1);
printf("size of float e' %lu \n",t2);
printf("size of double e' %lu \n",t3);
printf("size of long double e' %lu \n",t4);
return 0;

}