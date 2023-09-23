#include <stdio.h>
int main(void){

    int altura;
    unsigned idade;
    char genero;
                

    printf("Introduza a altura(em metros): \n");
    scanf("%i",&altura);
    printf("Introduza a idade: \n");
    scanf("%u",&idade);
    printf("Introduza o genero: \n");
    scanf("%c",&genero);

    printf("%i%u%c",altura,idade,genero);
    

   

    return 0;}