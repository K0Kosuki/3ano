#include <stdio.h>

int main(void) 
{
   unsigned char uc = 127;
   char          sc = 127;

   printf("Valor inicial de uc=%i e de sc=%i\a", uc, sc);
   uc = uc + 2; 
   sc = sc + 4;
   printf("Novo valor de uc=%i e de sc=%i\a", uc, sc);

   return 0;
}