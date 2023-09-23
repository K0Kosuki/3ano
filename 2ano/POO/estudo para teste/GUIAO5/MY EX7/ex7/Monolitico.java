import java.util.*;
public class Monolitico extends Circuito
{
    
    
    public Monolitico(int c)
    {
        super(c);
    }
    
    public double valor()
    {
    double t=0;
    for(Integer i : super.getComponentes())
     t += Tabela.precos(i) * super.get(i);
     return t;
    }

    public Circuito clone()
    {
        Monolitico m = new Monolitico(this.getCodigo());
        
    }
    
}
