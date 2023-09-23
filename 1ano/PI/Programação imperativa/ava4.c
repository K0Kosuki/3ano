#include<stdio.h>
#include<stdbool.h>
int main(int argc, char*argv[]){
    int n;
    int l=0;
    printf("valor");
    scanf("%i",&n);
    for (int j =0; j<=n;j++){
        printf("\n");
        l++;
        for(int i= 1; i<= n-j;i++){
            if (l%2==0){
                printf("*");
            }else{
                printf("-");
            }
        }
    }
    return 0;
}