
/**
 * Write a description of class Banco here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Banco
{
    // instance variables - replace the example below with your own
    private ArrayList<Conta2> banco;

    /**
     * Constructor for objects of class Banco
     */
    public Banco()
    {
        // initialise instance variables
        this.banco = new ArrayList<Conta2>();
    }

    public void add(String tit, int a, int m, int d, double si)
    {
        this.banco.add(new Conta2(a,m,d,tit, si));
    }
    private Conta2 find(int conta)
    {
        Iterator<Conta2> i = this.banco.iterator();
        boolean ha = false;
        Conta2 c = null;
        
        while(i.hasNext() && !ha)
        {
            c = i.next();
            if(c.getNum() == conta)
                ha = true;
        }
        
        if(ha)
            return c;
        else
            return null;
    }
    
    public boolean debito(int nc, int a, int m, int d, String desc, double v)
    {
        Conta2 c = this.find(nc);
        if(c != null)
        {
            return c.debito(a,m,d,desc,v);
        }
        else
            return false;
    }
    public boolean credito(int nc, int a, int m, int d, String desc, double v)
    {
        Conta2 c = this.find(nc);
        if(c != null)
        {
            c.credito(a,m,d,desc,v);
            return true;
        }
        else
            return false;
    }
    
    public int num_contas()
    {
        return this.banco.size();
    }
    public double saldo()
    {
        double total = 0.0;
        for(Conta2 c: this.banco)
            total += c.getSaldo();
            
        return total;
    }
    public void despesa(int a, int m, int d, String desc, double v)
    {
        
        for(Conta2 c: this.banco)
            c.debito(a,m,d,desc,v);
            
    }
}
