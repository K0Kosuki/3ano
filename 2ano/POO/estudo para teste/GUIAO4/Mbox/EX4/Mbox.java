import java.util.*;

public class Mbox
{
    private HashMap<Integer,ArrayList<Chamada>> lista;
    private int numero;
    
    public Mbox(int n)
    {
        this.numero=n;
        this.lista = new HashMap<Integer,ArrayList<Chamada>>();
    }
    
    public int num_chamada()
    {
        int ct=0;
        for(Integer c :this.lista.keySet())
         ct+=this.lista.get(c).size();
         return ct;
    }
    
    public void add(Chamada c)
    {
        if(this.lista.containsKey(c.getOrigem()))
        this.lista.get(c.getOrigem()).add(c.clone());
        else
        {
            ArrayList<Chamada> temp = new ArrayList<Chamada>();
            temp.add(c.clone());
            this.lista.put(c.getOrigem(),temp);
        }
    }
    
      public double valor_chamadas(int num)
    {
        double acc = 0.0;
        for(Chamada c: this.lista.get(num))
        {
            acc += c.valor();
        }
        
        return acc;
        
    }
}