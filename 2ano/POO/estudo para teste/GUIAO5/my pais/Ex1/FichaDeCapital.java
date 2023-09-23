
public class FichaDeCapital
{
     private String nomec;
     private int populacao;
     private int veiculo;
     private double salario;
     private double custo;

    
public FichaDeCapital(String nc,int p,int v,double s,double c)
{
   this.nomec = nc; this.populacao=p;this.veiculo=v;this.salario=s;this.custo=c;
}
    
    public String getNome()
{
    return this.nomec;
}

public int getNumV()
{
    return this.veiculo;
}

public int getPopulacao()
{
    return this.populacao;
}
public void setPopulacao(int popula)
{
    this.populacao = popula;
}

public double getSalario()
{
    return this.salario;
}

public double getCusto()
{ 
return this.custo;
}
    
    
    public FichaDeCapital clone()
    {
        return new FichaDeCapital(this.nomec,this.populacao,this.veiculo,this.salario,this.custo);
    }
   
}
