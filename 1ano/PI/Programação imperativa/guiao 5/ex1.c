#include <stdio.h>

int main()
{
    unsigned int capacidade_sala[10]={40, 45, 30, 60, 50, 45, 80, 35, 65 , 90};
    double area_sala[10]={30.0 , 42.5 , 35.75 , 42.25 };
    float ocupacao_sala[10]={[1]=0.6, [4]=0.45 , [5]=0.8 , [8]=0.75};

    for (int i = 0; i <= 9; i++)
    {
        printf("capacidade sala :%u\n",capacidade_sala[i]); 
        printf("area sala .%lf \n ",area_sala[i]);
        printf("ocupaca sala .%f \n ",ocupacao_sala[i]);
        printf("\n");
    }
}