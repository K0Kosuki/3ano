
/**
 * Write a description of class LivroReceitas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class LivroReceitas
{
    // instance variables - replace the example below with your own
    private Map<String,Receita> lista;

    /**
     * Constructor for objects of class LivroReceitas
     */
    public LivroReceitas()
    {
        // initialise instance variables
        this.lista = new HashMap<String,Receita>();
    }

    public void add(Receita r)
    {
        this.lista.put(r.getNome(),r.clone());
    }
    
    public int totalcalorias(String nome)
    {
        if(this.lista.containsKey(nome))
        {
            Receita r = this.lista.get(nome);
            return r.totalcalorias();
        }
        else
            return 0;
    }
    
    public Map<String,Set<String>> receitasPorIngrediente()
    {
        Map<String,Set<String>> temp = new HashMap<String,Set<String>>();
        
        for(Receita r:this.lista.values())
            for(String n:r.lista_ingredientes())
            {
                if(!temp.containsKey(n))
                {
                    Set<String> lst = new TreeSet<String>();
                    lst.add(r.getNome());
                    temp.put(n,lst);
                }
                else
                {
                    Set<String> lst = temp.get(n);
                    lst.add(r.getNome());
                }
            }
            
        return temp;
    }
}
