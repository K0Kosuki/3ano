#include <stdio.h>
#include <math.h>
raiz_quadrada (double n) {
double r = sqrt(n);
return r;
}
int main(void){
double numero;
printf("Introduza um numero: ");
scanf("%lf", &numero);
double resultado = raiz_quadrada( numero );
printf("A raiz quadrada de %f e’ %f\n", numero , resultado );
return 0;
}