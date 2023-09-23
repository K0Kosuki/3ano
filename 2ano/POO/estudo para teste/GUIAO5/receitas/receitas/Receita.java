
/**
 * Write a description of class Receita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Receita
{
    // instance variables - replace the example below with your own
    private String nome;
    private String desc;
    private String seq;
    private Set<Ingrediente> lista;

    /**
     * Constructor for objects of class Receita
     */
    public Receita(String n, String d, String s)
    {
        // initialise instance variables
        this.nome = n; this.desc = d; this.seq = s;
        // temos de dizer como ordenar/comparar Ingredientes para o TreeSet funcionar!!!
        //this.lista = new TreeSet<Ingrediente>( (a,b) -> a.getNome().hashCode()  - b.getNome().hashCode());
        this.lista = new TreeSet<Ingrediente>( (a,b) -> a.getNome().compareTo(b.getNome()));
    }

    public String getNome()
    { return this.nome;}
    public String getDesc()
    { return this.desc;}
    public String getSeq()
    { return this.seq;}
    
    
    
    public void add(Ingrediente i)
    { this.lista.add(i.clone()); }
    
    public int totalcalorias()
    {
        int total = 0;
        for(Ingrediente i:this.lista)
            total += i.getCal() * i.getQty();
            
        return total;
    }
    public int totalcalorias2()
    {
        int total = 0;
        for(Iterator<Ingrediente> i = this.lista.iterator(); i.hasNext();)
        {
            Ingrediente novo = i.next();
            total += novo.getCal() * novo.getQty();
        }
            
        return total;
    }
    
    public List<String> lista_ingredientes()
    {
        ArrayList<String> temp = new ArrayList<String>();
        for(Ingrediente i:this.lista)
            temp.add(i.getNome());
        
        return temp;
    }
    
    public Receita clone()
    { 
        Receita temp = new Receita(this.nome,this.desc,this.seq);
        for(Ingrediente i:this.lista)
            temp.add(i); // porque add() já faz clone!!
      return temp;
    }
    
}
