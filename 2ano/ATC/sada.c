#include <c8051f380.h>

int main(){

    PCA0MD = 0x00;
    XBR1 = 0x40;

while (1){
 if(P0_7==1)    
        P2=0xff;
        else{
              if(P0_7==0)
                P2=0xB0;
        }
    }
}