import java.util.*;
/**
 * Write a description of class Cidade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cidade
{
    // instance variables - replace thhe example below with your own
    private String nome;
    private ArrayList<Ligacao> lista;

    /**
     * Constructor for objects of class Cidade
     */
    public Cidade(String n)
    {
        // initialise instance variables
        this.nome = n;
        this.lista = new ArrayList<Ligacao>();
    }
    
    public String getNome()
    { return this.nome; }
    
    public void add(String n, int d)
    {
        this.lista.add(new Ligacao(n,d));
    }

    public int numLiga()
    { return this.lista.size(); }
    
    // retorna a dist se encontrou a cidade
    // -1 no caso contrário!
    public int find(String c)
    {
        boolean ha = false;
        Iterator<Ligacao> i = this.lista.iterator();
        Ligacao l = null;
        while(i.hasNext() &&  !ha)
        { l = i.next(); ha = l.getNome().equals(c); }
        
        if(ha)
            return l.getDist();
        else
            return -1;
        
    }
    
    public ArrayList<String> menosK(int K)
    {
        ArrayList<String> temp = new ArrayList<String>();
        
        for(Ligacao l : this.lista)
        {
            if(l.getDist() < K)
                temp.add(l.getNome());
        }
        
        return temp;
    }
    
    public Ligacao menorDist()
    {
        Ligacao min = this.lista.get(0);
        for(Ligacao l : this.lista)
            if(l.getDist() < min.getDist())
                min = l;
                
        return min.clone();
    }
}
