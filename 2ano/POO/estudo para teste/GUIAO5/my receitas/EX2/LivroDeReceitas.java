import java.util.*;

public class LivroDeReceitas
{
    private HashMap<String,Receita> lista;

    public LivroDeReceitas()
    {
      this.lista = new HashMap<String,Receita>();
    }
    
    public void put(String n,Receita r)
    {
        this.lista.put(r.getNome(),r.clone());
    }
    
    public int totalCalorias(String nome)
    {
        
    }
   
}
