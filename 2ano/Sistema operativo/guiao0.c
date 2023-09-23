
#include<stdio.h>
int main() {

int Size,Value,result;
printf("tamanho?: ");
scanf("%d",&Size);
int Vector[Size];

 fill(Vector,Size,Value); 

result = find(Vector,Size,Value);

printf("%d esta em posicao %d ",Value,result);


return 0;
}


