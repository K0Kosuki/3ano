import java.util.*;
public class Conta
{
    private String titular;
    private double saldo;
    private int numero_conta=0;
    private ArrayList<Mov> lista;    
   
    public Conta(String t,double s)
    {
       this.titular=t;
       this.saldo=s;
       this.numero_conta+=1;
       this.lista=new ArrayList<Mov>();
    }

    public String getTitular()
    {
        return this.titular;
    }
    public int getNc()
    {
        return this.numero_conta;
    }
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void add (int a,int m,int d,String des,double v)
    {
        this.lista.add(new Mov(v,des,a,m,d));
    }
    
    public boolean debito(int a,int m,int d,double v,String des)
    {
        if (this.saldo -v >=0)
        {
            this.saldo -= v;
            this.lista.add(new Mov(-1*v,des,a,m,d));
            return true;
        }
        else 
        return false;
    }
    
    public boolean credito(int a,int m,int d,double v,String des)
    {
        this.saldo+=v;
        this.lista.add(new Mov(v,des,a,m,d));
        return true;
        
    }
    
    
}
