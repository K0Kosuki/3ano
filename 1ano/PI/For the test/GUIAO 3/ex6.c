#include <stdio.h>
#include <stdlib.h>
int main()
{
    int i ;
    int x =31;
    
    
    for(i=1; i<=x;i++)
       
    {
        int z = i%7;
        switch(z)
        {
            
            case 1 :
               
                printf("%d : quarta\n",i);
                break;
                
            case 2 :
               
                printf("%d : quita\n",i);
                break;
            case 3 :
               
                printf("%d : sexta\n",i);
                break;
                
            case 4 :
               
                printf("%d : sabado\n",i);
                break;
                
            case 5 :
               
                printf("%d : domingo\n",i);
                break;
                
            case 6 :
               
                printf("%d : segunda\n",i);
                break;
                
            case 0 :
               
                printf("%d : domingo\n",i);
                break;
            z=1;
            default:
            printf("fk off\n");
        }
    }
        
return 0;
}

    
