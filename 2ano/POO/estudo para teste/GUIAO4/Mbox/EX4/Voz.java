
public class Voz extends Chamada
{
    private String tarifario;
    
    public Voz(int ori,int dura,double preco)
    {
        super(ori,dura,preco);
        this.tarifario="normal"; 
    }
    
    private double normal()
    {
       return (super.getDuracao()*super.getPreco())/60;
    }
    
    private double happy()
    {
        return super.getDuracao()*0.1;
    }
    
    public double valor()
    {
      if(this.tarifario.equals("happy"))
       return this.happy();
       else
       return this.normal();
    }
    
    public void setTari(String n)
    {
        this.tarifario = n;
    }
    
    
    public Voz clone()
    {
        return new Voz(super.getOrigem(),super.getDuracao(),super.getPreco());
    }
}
