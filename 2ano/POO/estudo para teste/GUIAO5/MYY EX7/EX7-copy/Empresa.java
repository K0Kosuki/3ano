import java.util.*;
public class Empresa
{
    private HashMap<Integer,Placa> lista;
    
    public Empresa()
    {
        this.lista = new HashMap<Integer,Placa>();
    }
    public void add(Placa p)
    {
        if(this.lista.containsKey(p.getCod()))
        {
            this.lista.put(p.getCod(),lista.get(p.getCod()));
        }
        else
        {
            this.lista.put(p.getCod(),p.clone());
        }
    }
    
    public int maisValor()
    {
        double max=0;
        int maxc=0;
        for(Placa p : this.lista.values())
        {
            if(max<p.valor_total())
            {
                max=p.valor_total();
                maxc= p.getCod();
            }
        }
        return maxc;
    }
    
    public int mais_frequente()
    {
        int maxs =0;
        int maxc=0;
        for(Placa p : this.lista.values())
        {
            if(maxs<p.tamanho())
            {
                maxs=p.tamanho();
                maxc=p.getCod();
            }
        }
       return maxc;
    }
}
