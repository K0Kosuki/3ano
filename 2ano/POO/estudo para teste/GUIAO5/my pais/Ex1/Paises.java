import java.util.HashMap;
import java.util.*;
public class Paises
{
    
    private HashMap<String,FichaDeCapital> lista;

    public Paises()
    {
       this.lista = new HashMap<String,FichaDeCapital>(); 
    }

    public void put(String nome,FichaDeCapital f)
    {
        this.lista.put(nome,f.clone());
    }
    
    public int numero_total()
    {
        return this.lista.size();
    }
    
    public ArrayList<String> pop_limite(int lim)
    {
        ArrayList<String> novap=new ArrayList<String>();
        
        for(String s : this.lista.keySet())
        {
            FichaDeCapital fx=this.lista.get(s);
            
            if(fx.getPopulacao()>lim)
                {
                    novap.add(s);
                }
        }
        
        return novap;
    }

    public FichaDeCapital getFichaCompleta(String nome)
    {
        if(this.lista.containsKey(nome))
        return this.lista.get(nome);
        else
        return null;
        
    }
    
    public void setPopulacao(String nome,int p)
    {
        if(this.lista.containsKey(nome))
        this.lista.get(nome).setPopulacao(p);
    }
    
    public ArrayList<String> cap()
    {
        ArrayList<String> listcap = new ArrayList<String>();
        for(FichaDeCapital f :this.lista.values())
        {
            listcap.add(f.getNome());
        }
        return(listcap);
    }

    public int somap()
    {
        int soma=0;
        for(FichaDeCapital f:this.lista.values())
        soma+=f.getPopulacao();
        return soma;
    }
    
    public void map(Map<String,FichaDeCapital> f)
    {
        for(String p:f.keySet())
        this.lista.put(p,f.get(p).clone());
    }
    public void remover()
}
