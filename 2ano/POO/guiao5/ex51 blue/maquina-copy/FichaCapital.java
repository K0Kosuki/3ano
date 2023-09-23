

public class FichaCapital  {
  
   private String capital;
   private int populacao;
   private int numvelculo;
   private double salariomedio;
   private double custo;


public FichaCapital(String nome_Cap,int num_velculo,int popula,double salar,double cus)
{

this.capital = nome_Cap;
this.numvelculo = num_velculo;
this.populacao = popula;
this.salariomedio = salar;
this.custo = cus;
}

public FichaCapital(FichaCapital f)
{
    this(f.getNome(),f.getNumV(),f.getPopulacao(),f.getSalariomed(),f.getCusto());
}


public String getNome()
{
    return this.capital;
}

public int getNumV()
{
    return this.numvelculo;
}

public int getPopulacao()
{
    return this.populacao;
}
public void setPopulacao(int popula)
{
    this.populacao = popula;
}

public double getSalariomed()
{
    return this.salariomedio;
}

public double getCusto()
{ 
return this.custo;
}

public FichaCapital clone()
    { return new FichaCapital(this);}

}
