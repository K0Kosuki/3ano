import java.util.*;
public abstract class Hotel
{
    private String nome;
    private String local;
    private double precoBase;
    private int num;
    private Set<Integer> ocupa;

    public Hotel(String n,String l,double p,int num)
    {
        this.nome = n;
        this.local= l;
        this.precoBase=p;
        this.num = num;
        this.ocupa = new TreeSet<Integer>();
    }
    public String getNome()
    {
        return this.nome;
    }
    public String getLocal()
    {
        return this.local;
    }
    public double getPreco()
    {
        return this.precoBase;
    }
    public int getNum()
    {
        return this.num;
    }
    public void add(Integer c)
    {
        this.ocupa.add(c);
    }
    public void remover(Integer c)
    {
        this.ocupa.remove(c);
    }
    
    public Set<Integer> getOcupa()
    {
       TreeSet<Integer> temp =  new TreeSet<Integer>();        
       for(Integer i :this.ocupa)
       temp.add(i);
       return temp;
    }
    public int getNumOcupa()
    {
        return this.ocupa.size();
    }
    
    public abstract double dormida(int mes);
    public abstract Hotel clone();
}
