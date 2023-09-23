#include <stdio.h>

int main(){
    
    int j=1;
    
    for(int i=1;i<=31;i++){
            
            switch(j){
                
                case 1:
                    
                    printf("\n%d - Quarta-feira",i);
                    j++;
                    break;
                    
                case 2:
                    
                    printf("\n%d - Quinta-feira",i);
                    j++;
                    break;
                    
                case 3:    
                    
                    printf("\n%d - Sexta-feira",i);
                    j++;
                    break;
                    
                case 4:
                
                    printf("\n%d - Sabado",i);
                    j++;
                    break;
                    
                case 5:
                
                    printf("\n%d - Domingo",i);
                    j++;
                    break;
                    
                case 6:
                
                    printf("\n%d - Segunda-feira",i);
                    j++;
                    break;
                    
                case 7:
                
                    printf("\n%d - Terca-feira",i);
                    j=1;
                    break;                
                
            }
            
        
    }
    
}