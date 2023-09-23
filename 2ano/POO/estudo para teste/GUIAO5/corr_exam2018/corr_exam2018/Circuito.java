import java.util.*;
public abstract class Circuito
{  
    private int codigo; // código
    private HashMap<Integer,Integer> lista; // associa componente com quantidade

    Circuito(int c)
    { this.codigo = c; this.lista = new HashMap<Integer,Integer>();}

    public int getCodigo()
    { return this.codigo;}
    
    public Set<Integer> getComponentes()
    { return this.lista.keySet(); } // Integer é imutável!
    
    public int tamanho()
    { return this.lista.size(); }
    
    public void add(Integer k, Integer v)
    { this.lista.put(k,v); } //
    
    public Integer get(Integer k)
    { return this.lista.get(k);}

    public abstract double valor();
    public abstract Circuito clone();
}
