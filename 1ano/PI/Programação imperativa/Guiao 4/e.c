#include "stdio.h"
int main(void)
{
  int N = 8;
  int s[N] = {1,2,3,4,5,6,7,8,9,10,11}; // ... <=> 8 ou mais inteiros separados por vírgulas
  int p1=1, p2=0, I, z=0;
  for (int i = 0; i < N; i++) {
    if (s[i] > p1) {
      p2 = p1;
      p1 = s[i];
    }
    else if (s[i] > p2 && s[i] < p1) {
      p2 = s[i];
    }
  }
  printf("%d,%d",p2,p1);
}