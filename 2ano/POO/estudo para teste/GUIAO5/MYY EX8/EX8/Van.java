

public class Van extends Veiculo implements Contratavel
{
    private double dis;
    private double peso;
    private String cliente;
    private int capacidade;
    
    public Van(String m,double c,double d,double p,String cli)
    {
        super(m,c);
        this.dis= d;
        this.peso=p;
        this.cliente=cli;
    }
    public double getDistancia()
    {
        return this.dis;
    }
    public double getPeso()
    {
        return this.peso;
    }
    public String getCliente()
    {
        return this.cliente;
    }
    
    public int getNc()
    {
        return this.cliente.length();
    }
    
    public double custoPorContrato(Contratavel ct)
    {
      return (this.getCusto()*ct.getPeso()*ct.getDistancia())/ct.getCliente().length();
    }
}
