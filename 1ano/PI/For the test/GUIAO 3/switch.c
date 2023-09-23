#include <stdio.h>
#include <stdlib.h>

// O programa deve ser chamado com um argumento: o valor da 'opcao'
int main(int argc, char *argv[])
{
   const int opcao = argc > 1 ? atoi(argv[1]) : -1;
   printf("um numero");
   scanf("%d", &opcao);
   switch(opcao) {
      case 1:
         printf("Ramificacao 1\n");
         break;
      case 2:
         printf("Ramificacao 2\n");
      case 3:
         printf("Ramificacao 3\n");
         break;
      case 4:
         printf("Ramificacao 4\n");
         break;
      default:
         printf("Ramificacao por omissao\n");
         break;
   }
   return 0;
}