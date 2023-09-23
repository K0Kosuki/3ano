#include <stdio.h>

int main(){

  int mi [4][8]={{1,3,5,7,9,11,13,15},{0,2,4,6,8,10,12,14},{17,19,21,23,25,27,29,31},{16,18,20,22,24,26,28,30}};
  int soma=0;
  int total=0;
  for(int i=0;i<4;i++){
    for(int x=0;x<8;x++)
    {
     soma=mi[i][x]+soma;
      
    }
   
    total= total+soma;


  }
  
   
   
   