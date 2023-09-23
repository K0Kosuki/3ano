
/**
 * Write a description of class Conta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conta
{
    // vars class
    private static final int TAMANHO = 100;
    private static int conta = 0;
    private static double sgeral = 0.0;
    
    public static int getConta()
    { return Conta.conta;}
    public static double saldo()
    { return Conta.sgeral;}
    
    // instance variables - replace the example below with your own
    private String titular;
    private double saldo;
    private int num;
    private double movs[];
    private int index;

    /**
     * Constructor for objects of class Conta
     */
    public Conta(String a, double si)
    {
        // initialise instance variables
        this.titular = a;
        this.num = ++Conta.conta;
        this.index = 0;
        this.saldo = 0.0;
        this.movs = new double[Conta.TAMANHO];
        this.credito(si);
    }
    public Conta(Conta a)
    {
        this.titular = a.getTitular();
        this.num = a.getNum();
        this.saldo = a.getSaldo();
        this.index = a.getIndex();
        this.movs = a.getMovs();
    }

    public int getIndex()
    { return this.index;}
    public double[] getMovs()
    {
        double[] temp = new double[Conta.TAMANHO];
        for(int i=0; i < this.index; i++)
            temp[i] = this.movs[i];
            
        return temp;
    }
    
    public String getTitular()
    {
        return this.titular;
    }
    public int getNum()
    { return this.num; }
    public double getSaldo()
    {
        return this.saldo;
    }
    public void credito(double v)
    {
        // put your code here
        this.movs[this.index++] = v;
        this.saldo += v;
        Conta.sgeral += v;
    }
    public void debito(double v)
    {
        this.movs[this.index++] = -v;
        this.saldo -= v;
        Conta.sgeral -= v;
    }
    
    
    public boolean equals(Conta c)
    {
        if(c != null)
        {
            return this.num == c.getNum();
        }
        else
            return false;
    }
    
    public Conta clone()
    {
        return new Conta(this);
    }
    
    public String toString()
    {
        return this.num+","+this.titular+","+this.saldo;
    }
}
