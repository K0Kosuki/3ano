#include <stdio.h>

double fun1 (double x,double y , double *quo){

    double r = x*y;
    *quo = x/y;
    return (r);
}

int main(){
double n1,n2;
double quo;
printf("2 numeros :\n");
scanf("%lf",&n1);
scanf("%lf",&n2);

double resultado = fun1(n1,n2,&quo);
printf("produto e quociente : %lf , %lf\n",resultado,quo);
return 0;

}