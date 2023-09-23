
/**
 * Write a description of class MBox here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MBox
{
    // instance variables - replace the example below with your own
    private int numero;
    private HashMap<Integer,ArrayList<Chamada>> lista;

    /**
     * Constructor for objects of class MBox
     */
    public MBox(int n)
    {
        // initialise instance variables
        this.numero = n;
        this.lista = new HashMap<Integer,ArrayList<Chamada>>();
    }

    public int origens()
    { return this.lista.size(); }
    
    public int num_chamadas()
    {
     int acc = 0;
     
        for(Integer k:this.lista.keySet())    
            acc += this.lista.get(k).size();
            
        return acc;
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
    
    
    public int max_sms()
    {
        int vmax=0,max=0;
        for(Integer k:this.lista.keySet())
        {
            int conta = 0;
            for(Chamada c:this.lista.get(k))
            {
                //if(c instanceof SMS)
                if(c.getClass().getName().equals("SMS"))
                    conta++;
            }
            
            if(conta > vmax)
            { max = k; vmax = conta; } 
        }
        
        return max;
    }
}
