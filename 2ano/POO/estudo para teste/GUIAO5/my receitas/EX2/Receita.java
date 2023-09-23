import java.util.*;
public class Receita
{
   private String nome;
   private String desc;
   private Set<Ingrediente> lista;
   private String seque;
   public Receita(String n,String d,String s)
    {
       this.nome=n;
       this.desc=d;
       this.lista = new TreeSet<Ingrediente>();
       this.seque=s;
    }
    
    
    public String getNome()
    { 
        return this.nome;
    }      
    public String getDesc()
    {    
        return this.desc;
    }
    public String getSeq()
    { 
        return this.seque;
    }   
    public void add(Ingrediente i)
    {
        this.lista.add(i.clone());
    }

    public Receita clone()
    {
        Receita temp= new Receita(this.nome,this.desc,this.seque);
        for(Ingrediente i :this.lista)
        temp.add(i);
        return temp;
        
    }
    
    public int totalcalorias()
    {
        int total=0;
        for(Ingrediente i:this.lista)
        {
            total += i.getCal()*i.getQty();
        }
        return total;
    }
}
   

