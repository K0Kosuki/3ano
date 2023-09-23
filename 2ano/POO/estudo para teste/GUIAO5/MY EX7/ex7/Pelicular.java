
public class Pelicular extends Circuito
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double preco;

  
    public Pelicular(int c,double p)
    {
       super(c);
       this.preco=p;
    }

   
    public double valor()
    {
        double t=0;
        for(Integer i : super.getComponentes())
        t += super.get(i);
        
        return this.preco*(t/super.tamanho());
    }
    
    public Pelicular clone()
    {
        
        
    }
}
