#include <stdio.h>

int main(){

    int par[10], impar[10];
    int p=0,im=0,m3=0;

    for(int i=1;i<=20;i++){
        if(i%2==0) {
            par[p] = i;
            p++;
        }
        else {
            impar[im] = i;
            im++;
        }
    }

    int soma[10];

    for(int i=0;i<10;i++){
        soma[i] = par[i] + impar[i];
        if(soma[i]%3==0) m3++;
    }

    for(int i=0;i<10;i++){
        printf("posicao %i -> %i + %i = %i\n",i,par[i],impar[i],soma[i]);
        printf("tem %i multiplo de 3\n",m3);
    }

    

}