import java.util.*;
public class GereEstufas
{
    private String nome;
    private ArrayList<Estufa> lista;
    public GereEstufas(String n)
    {
        this.nome=n;
        this.lista = new ArrayList<Estufa>();
    }
    public String getNome()
    {
      return  this.nome;
    }
    public void add(Estufa e)
    {
        this.lista.add(e.clone());
    }

    public double area_total()
    {
        double a_total=0;
        for(Estufa e:this.lista)
        a_total+=e.getArea();
        return a_total;
    }
    
    public List<Integer> emRisco(int temp)
    {
        ArrayList<Integer> t=new ArrayList<Integer>();
        
        for(Estufa e:this.lista){
        if(e.emRisco(temp))
        t.add(e.getCodigo());
    }
    return t;
    
    }
}
