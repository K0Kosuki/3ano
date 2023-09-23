#include<stdio.h>
double produtoInterno(int N, double a [],double b []){
double produto[N];
double x=0;
for(int i=0;i<N;i++){
produto[i]=a[i]*b[i];
x=x+produto[i];
}
return x;
}

int main (int argc,char*argv){
int n=10;
double arr[10]={1,2,3,4,5,6,7,8,9,10};
double ar[10]={11,12,13,14,15,16,17,18,19,20};
double total = produtoInterno(n,arr,ar);
printf("%lf",total);
return 0;
}