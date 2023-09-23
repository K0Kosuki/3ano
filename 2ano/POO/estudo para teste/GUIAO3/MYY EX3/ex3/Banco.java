import java.util.*;

public class Banco
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private ArrayList<Conta> lista;
    


    public Banco()
    {
      this.lista = new ArrayList<Conta>();
    }
    
    public void add(String tit, int a, int m, int d, double si)
    {
        this.lista.add(new Conta(tit, si));
    }
    
    public int getNc()
    {
            return this.lista.size();
    }
    
    public Conta find(int conta)
    {
        Conta c=null;
        Iterator<Conta> i = this.lista.iterator();
        boolean ha=false;
        while(i.hasNext() && !ha)
        {
            c=i.next();
            if(c.getNc()==conta)
            {
                ha = true;
            }
        }
        if(ha)
        {
            return c;
        }
        else 
        return null;
    }
    
    
    public boolean debito(int a,int m,int d,String des,int nc,double v)
    {
        Conta c= this.find(nc);
        if(c !=null)
        {
            return c.debito(a,m,d,v,des);
        }
        else
        return false;
    }
    
    public boolean credito(int a,int m,int d,String des,int nc,double v)
    {
        Conta c = this.find(nc);
        if(c !=null)
        {
            return c.credito(a,m,d,v,des);
        }
        else
        return false;
    }
    
    public double total()
    {
       double total =0;
        for(Conta c:this.lista)
            total+=c.getSaldo();
            return total;
    }
    
    public void despesa(int a, int m, int d, String desc, double v)
    {
        
        for(Conta c: this.lista)
            c.debito(a,m,d,v,desc);
            
    }
    
    public double medio()
    {
        return this.total()/this.lista.size();
    }
 
}
