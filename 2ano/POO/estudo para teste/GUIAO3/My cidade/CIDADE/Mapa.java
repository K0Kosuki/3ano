
import java.util.*;
public class Mapa
{
    // instance variables - replace the example below with your own
    private ArrayList<Cidade> lista;

    /**
     * Constructor for objects of class Mapa
     */
    public Mapa()
    {
        // initialise instance variables
        this.lista = new ArrayList<Cidade>();
    }

    public void add(String nome)
    {
        // put your code here
        this.lista.add(new Cidade(nome));
    }
    
    public void addLiga(String nome, String c, int k)
    {
        Iterator<Cidade> i = this.lista.iterator();
        Cidade temp = null;
        boolean ha = false;
        while(i.hasNext() && !ha)
        {
            temp = i.next();
            ha = temp.getNome().equals(nome);
        }
        if(ha) // sucesso?
        {
            temp.add(c,k);
        }
    }
    
    
    public boolean ligDireto(String a, String b)
    {
       // procurar primeira cidade
       Iterator<Cidade> i = this.lista.iterator();
       Cidade temp = null;
       boolean ha = false;
       while(i.hasNext() && !ha)
       {
            temp = i.next();
            ha = temp.getNome().equals(a);
       }
       if(ha) // sucesso?
       {
            return (temp.find(b) > 0 ? true : false);
       } 
       else
        return false;
    }
    
    public String maiorNumLiga()
    {
        Cidade max = this.lista.get(0);
        for(Cidade c: this.lista)
            if(c.numLiga() > max.numLiga())
                max = c;
                
        return max.getNome();
    }
    
    public String menorLigaCidades()
    {
        Cidade min = this.lista.get(0);
        Ligacao ll = min.menorDist();
        for(Cidade c: this.lista)
        {
            Ligacao temp = c.menorDist();
            if(temp.getDist() < ll.getDist())
            { min = c; ll = temp; }
        }       
        
        return "distancia entre "+min.getNome() + " e "+ ll.getNome() + " = "+ll.getDist();
    }
    
    public ArrayList<String> cidadesMenosK(String c, int K)
    {
        // procurar primeira cidade
       Iterator<Cidade> i = this.lista.iterator();
       Cidade temp = null;
       boolean ha = false;
       while(i.hasNext() && !ha)
       {
            temp = i.next();
            ha = temp.getNome().equals(c);
       }
       if(ha) // sucesso?
       {
           return temp.menosK(K);
       }
       else
           return null;
        
    }
    
}
