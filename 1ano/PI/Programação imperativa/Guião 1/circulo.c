#include <stdio.h>

int main(void) 

{
float pi = 3.14159 ; //Declara uma variável pi, de vírgula flutuante precisão simples,que é inicializada com o valor aproximado do pi (3.14159)

int r = 3; //Declara o raio

float area = r*r*pi ;            //Declara area e perimeto
float perimetro = 2*r*pi;

printf("RAIO = %f\n",r);
printf("perimetro = %f\n",perimetro);
printf("area = %f\n",area);

system("pause");
return 0;
}