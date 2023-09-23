import java.util.*;
import java.util.stream.*;
/**
 * Write a description of class Stand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stand
{
    // instance variables - replace the example below with your own
    private String nome;
    private ArrayList<Veiculo> lista;  
    private int tamanho;
    
    /**
     * Constructor for objects of class Stand
     */
    public Stand()
    {
        this.lista = new ArrayList<Veiculo>();
        this.nome = " ";
        this.tamanho = 5;
    }

    
    public Stand(String n, int t)
    {
        this.lista = new ArrayList<Veiculo>();
        this.tamanho = t;
        this.nome = n;
    }
    
    public boolean adicionar(String m, int kms, int cap, int l, double med, int v)
    { 
        if(this.lista.size() < this.tamanho)
        {
            this.lista.add(new Veiculo(m,kms,cap,l,med,v)); 
            return true;
        }   
        else
            return false;
    }
    public boolean adicionar(Veiculo v)
    { 
        if(this.lista.size() < this.tamanho)
        {
            this.lista.add(v.clone()); 
            return true;
        }   
        else
            return false;
    }
    
    public boolean vender(String m)
    {
        Veiculo temp = new Veiculo(m,0,0,0,0,0);
        return this.lista.remove(temp);
    }  
        
    public boolean vender2(String m)  
    { /*
        boolean flag = false;
        Iterator<Veiculo> i = this.lista.iterator();
        while(i.hasNext() && !flag)
        {
            Veiculo v = i.next();
            if(v.getMatricula().equals(m))
            {    i.remove(); flag = true; }
        }
        return(flag);
        */
    
        //equivalente a:
        boolean flag = false;
        Veiculo v = null;
        for(Iterator<Veiculo> i = this.lista.iterator(); i.hasNext() && !flag; )
        {
              v = i.next();
              if(v.getMatricula().equals(m))
              {    i.remove(); flag = true; }    
              
        }
        return(flag);
         
    }
    
       
    
    public int numveiculos()
    { return this.lista.size(); }
    
    
    public String maisuso()
    {
        
        Veiculo max = this.lista.get(0);
        for(Veiculo v:this.lista)
            if(v.getKms() > max.getKms())
            { max = v;}
            
        return max.getMatricula();
    }
    
    public String maisuso2()
    {
        Iterator<Veiculo> i = this.lista.iterator();
        Veiculo max = this.lista.get(0);
        while(i.hasNext())
        {
            Veiculo prox = i.next();
            if(prox.getKms() > max.getKms())
                max = prox;
        }
        
        return max.getMatricula();
    }
    
    public String maisuso3()
    {
        //Comparator<Veiculo> comp = (v1,v2) -> v1.getKms() - v2.getKms();
        Veiculo v = this.lista.stream().collect(Collectors.
        toCollection(() -> new TreeSet<Veiculo>((v1,v2) -> v2.getKms() - v1.getKms()))).first();
        return v.getMatricula();
        //return ((Veiculo)v).getKms();
        //return this.lista.stream().mapToInt(Veiculo :: getKms).max().getAsInt();
    }
    
    public long totalgas()
    {
        long total = 0;
        for(Veiculo v: this.lista)
            total += v.getLitros();
            
        return total;
    }
    
    public long totalgas2()
    {
        return this.lista.stream().mapToInt(Veiculo :: getLitros).sum();
    }
    
    public ArrayList<Veiculo> veiculosViagem(int k)
    {
        ArrayList<Veiculo> temp = new ArrayList<Veiculo>();
        
        for(Veiculo v: this.lista)
            if(v.autonomia() >= k * 2)
                temp.add(v.clone());
                
        return temp;
        
    }
    public ArrayList<String> veiculosViagemS(int k)
    {
        ArrayList<String> temp = new ArrayList<String>();
        
        for(Veiculo v: this.lista)
        {
            if(v.autonomia() >= k * 2)
                temp.add(v.getMatricula());
        }
                
        return temp;    
    }
    
    public double mediaViagens()
    { return this.lista.stream().collect(Collectors.averagingInt(Veiculo :: getViagens));  }
    
    
    public List<Veiculo> veiculosViagem2(int k)
    {
        return this.lista.stream().filter(v -> v.autonomia() >= k * 2).map(Veiculo :: clone).collect(Collectors.toList());
    }
    public double mediakms()
    {
        return this.lista.stream().collect(Collectors.averagingInt(Veiculo :: getKms));
    }
    public double mediakms2()
    {
        return this.lista.stream().mapToInt(Veiculo :: getKms).average().getAsDouble();
    }
    
    public long emReserva()
    {  return this.lista.stream().filter(v -> v.reserva()).count();  }
    
    public String toString()
    { return this.lista.toString(); }
}
