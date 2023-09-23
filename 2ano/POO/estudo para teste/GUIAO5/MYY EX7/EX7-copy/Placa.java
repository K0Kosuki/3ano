import java.util.*;
public class Placa
{
    private int codigo;
    private ArrayList<Circuito> lista;
    
    public Placa(int c)
    {
        this.codigo=c;
        this.lista=new ArrayList<Circuito>();
        
    }
    public int getCod()
    {
        return this.codigo;
    }
    public void add(Circuito c)
    {
        this.lista.add(c.clone());
    }
    
    public double valor_total()
    {
        double v= 0;
        for(Circuito c: this.lista)
        v+=c.valor();
        return v;
    }
    
    public int tamanho()
    {
        return this.lista.size();
    }
    public Placa clone()
    {
        
        Placa temp = new Placa(this.codigo);
        for(Circuito c: this.lista)
            temp.add(c); 
        
        return temp;
    }
}
