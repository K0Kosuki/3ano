#include <stdio.h>

int main(void)
{
	int a, b, c, d, e, f;
	int i = 30;
	int j = 0;

	a = i && j;
	b = !j;
	c = !i;

	float x = 30.0;
	float y = 0.0;

	d = x || y;
	e = !y;
	f = !x;

   	printf("%d\n%d\n%d\n%d\n%d\n%d\n", a, b, c, d, e, f);
}