
/**
 * Write a description of class MBox_AL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MBox_AL
{
    // instance variables - replace the example below with your own
    private int numero;
    private ArrayList<Chamada> lista;

    /**
     * Constructor for objects of class MBox_AL
     */
    public MBox_AL(int x)
    {
        // initialise instance variables
        this.numero = x;
        this.lista = new ArrayList<Chamada>();
    }

    public int recebidas()
    { return this.lista.size(); }
    
    public int diferentes()
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(Chamada c: this.lista)
        {
            if(temp.indexOf(c.getOrigem()) == -1)
                temp.add(c.getOrigem());
        }
        
        return temp.size();
    }
    
    public void add(Chamada c)
    {
        this.lista.add(c.clone());
    }
    
    public double valor_total(int orig)
    {
        double tot = 0.0;
        for(Chamada c: this.lista)
            if(orig == c.getOrigem())
                tot += c.valor();
                
        return tot;
    }
    
    public int mais_sms()
    {
        ArrayList<Integer> orig = new ArrayList<Integer>();
        ArrayList<Integer> cc = new ArrayList<Integer>();
        
        for(Chamada c : this.lista)
        {
            if(c instanceof SMS) // if("SMS".equals(c.getClass().getName()))
            {
                int i = orig.indexOf(c.getOrigem());
                if(i != -1)
                    cc.set(i,cc.get(i) + 1);
                else
                {
                    orig.add(c.getOrigem());
                    cc.add(1);
                }
            }
        }
        
        // calcular um maximo
        int i = 0;
        for(int x=0; x < orig.size(); x++)
            if(cc.get(i) < cc.get(x))
                i = x;
                
        return orig.get(i);
    }
}
