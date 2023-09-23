import java.util.*;
public class Leiloeira
{
    private HashMap<String,Artigo> mapa;
    
    public Leiloeira()
    {
        this.mapa = new HashMap<String,Artigo>();
    }
    public void add(String nome,Artigo a)
    {
        this.mapa.put(nome,a);
    }
    
    public String Artigomais_rentavel()
    {
        double tm=0;
        double tq=0;
         
        for(Artigo a:this.mapa.values())
        {
            if(a.getClass().getName().equals("Mobilias"))
            {
                tm++;
            }
            else
            tq++;
        }
        
        return (tm > tq ? "Mobilias" : "Quadros");
    }
    
    public Set<Double> ordem()
    {
        Set<Double> lista = new TreeSet<Double>();
        for(Artigo a:this.mapa.values())
        lista.add(a.comissao());
        return lista;
    }
    
    public Map<Double,TreeSet<Integer>> comissaoParaCodigo()
    {
        HashMap<Double,TreeSet<Integer>> cc = new HashMap<Double,TreeSet<Integer>>();
        for(Artigo a : this.mapa.values())
        {
            TreeSet<Integer> lista= new TreeSet<Integer> ();
        
        }
    }
}
