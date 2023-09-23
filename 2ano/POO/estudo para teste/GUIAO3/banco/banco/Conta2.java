import java.util.*;
/**
 * Write a description of class Conta2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conta2
{
    // instance variables - replace the example below with your own
    private String titular;
    private double saldo;
    private int num;
    private ArrayList<Mov> movs;
    
    // vars de classe
    private static int nc = 1;
    
    
    /**
     * Constructor for objects of class Conta2
     */
    public Conta2(String t, double si)
    {
        // initialise instance variables
        this.titular = t;
        this.saldo = si;
        this.num = Conta2.nc++;
        this.movs = new ArrayList<Mov>();
        GregorianCalendar now = new GregorianCalendar();
        int a = now.get(GregorianCalendar.YEAR);
        int m = now.get(GregorianCalendar.MONTH);
        int d = now.get(GregorianCalendar.DAY_OF_MONTH);
        this.movs.add(new Mov(a,m,d,"saldo inicial",si));
        
    }
    public Conta2(int a, int m, int d, String t, double si)
    {
        // initialise instance variables
        this.titular = t;
        this.saldo = si;
        this.num = Conta2.nc++;
        this.movs = new ArrayList<Mov>();
        this.movs.add(new Mov(a,m,d,"saldo inicial",si));
        
    }
    
    // método de classe
    public static int getNC()
    { return nc-1; }

    /**
     * Métodos de instancia começando pelos selectores. 
     */
    public String getTitular()
    {
        return this.titular;
    }
    
    public double getSaldo()
    { return this.saldo; }
    
    public int getNum()
    { return this.num; }
    
    public boolean debito(int a, int m, int d, String de, double v)
    { 
        if(this.saldo - v >= 0.0)
        {
            this.saldo -= v; 
            this.movs.add(new Mov(a,m,d,de,-1 * v)); 
            return true;
        }
        else
            return false;
    }
    
    public void credito(int a, int m, int d, String de, double v)
    { 
        this.saldo += v; 
        this.movs.add(new Mov(a,m,d,de,v)); 
    }
    
    public String lista_movs()
    {
        String temp = "";
        for(Mov m: this.movs)
            temp += m.getData() +" "+ m.getDesc() + " " + m.getValor() +"\n";
            
        return(temp);
    }
    
    public boolean equals(Conta2 c)
    {
        if(c != null)
            return(this.num == c.getNum() && this.titular.equals(c.getTitular()));
        else
            return(false);
    }
    
    public Object clone()
    {
        Mov tmp = this.movs.get(0);
        Conta2 temp = new Conta2(tmp.getAno(),tmp.getMes(),tmp.getDia(),this.titular,tmp.getValor());
        for(Mov m:this.movs)
        {
            if(m.getValor() > 0.0)
                temp.credito(m.getAno(),m.getMes(),m.getDia(),m.getDesc(),m.getValor());
            else
                temp.debito(m.getAno(),m.getMes(),m.getDia(),m.getDesc(),-1 * m.getValor());
        }
        return(temp);
    }
}
