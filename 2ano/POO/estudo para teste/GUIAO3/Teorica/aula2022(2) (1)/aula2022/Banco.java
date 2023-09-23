
/**
 * Write a description of class Banco here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Banco
{
    private static final int TAM = 100;
    private static int index = 0;
    
    // instance variables - replace the example below with your own
    private String nome;
    private Conta contas[];

    /**
     * Constructor for objects of class Banco
     */
    public Banco(String n)
    {
        // initialise instance variables
        this.nome = n;
        this.contas = new Conta[Banco.TAM];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void criar(String n, double si)
    {
        Conta c = new Conta(n,si);
        this.contas[Banco.index++] = c;
    }
    
    private int pesquisa(int n)
    {
        int i =0;
        while(i < Banco.index && this.contas[i].getNum() != n)
            i++;
        if(i < Banco.index)
            return i;
        else
            return -1;
    }
    public void credito(int n, double v)
    {
        int i = this.pesquisa(n);
        if(i != -1)
        {
            this.contas[i].credito(v);
        }
    }
    public void debito(int n, double v)
    {
        int i = this.pesquisa(n);
        if(i != -1)
        {
            this.contas[i].debito(v);
        }
        
    }
    
    public String getTitular(int n)
    {
        int i = this.pesquisa(n);
        if(i != -1)
        {
            return this.contas[i].getTitular();
        }
        else
            return "nao existe";
    }
    public double getSaldo(int n)
    {
        int i = this.pesquisa(n);
        if(i != -1)
        {
            return this.contas[i].getSaldo();
        }
        else
            return -1;
    }
    
    public void despesas(double v)
    {
        for(int i=0; i < Banco.index; i++)
            this.contas[i].debito(v);
    }
    
    public int numContas()
    {
        return Conta.getConta();
    }
    public double saldo()
    {
        return Conta.saldo();
    }
}
