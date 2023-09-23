#include <stdio.h>
#include <stdbool.h>
struct retangulo {
    float l;
    float h;
    float w;
    float area;
    float volume;
};
void calculosRet (struct retangulo r1)
{
    float volume = r1->lr1->hr1->w;
    float area =2r1->l+2r1->hr1->l+2r1->wr1->h;
}

int main(){
    struct retangulo r1 ={scanf("%i",&r1.l),scanf("%i",&r1.h),scanf("%i",&r1.w),0,0};
    calculosRet(&r1);

    return 0;
}