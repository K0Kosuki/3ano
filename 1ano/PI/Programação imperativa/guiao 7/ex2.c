void media_soma(double a[], int n, double *med, double *soma)
{
int i;
soma = 0.0;
for (i=0; i<n; i++)
soma += a[i];
med = soma / n;
}
double media_sona_retorna(double a[],int n)
{
    int i;
    double soma = 0.0;
    for ( i = 0; i < n; i++)
    {
        soma += a[i];
return soma;
    }
    
}

int main(){
    int array[4] = {0,1,2,3};
    int n =4;
    double *media;
    double *soma;
    media_soma(array, n, soma);
    double r = media
}