#include <stdio.h>
int main()

{
    float c;
    
     printf("Quando grau(celsius)\n");
    scanf("%f",&c);
     
     float f = 1.8*c+32;
     float k = 273.15+c ;   

printf("%f grua em celsiu igua : %f F e %f K\n", c, f, k);
return 0;
}