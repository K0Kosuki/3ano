import java.util.*;
public class Placa
{  
    private int codigo;
    private ArrayList<Circuito> lista;
    
    public Placa(int c)
    {
        this.codigo=c;
        this.lista = new ArrayList<Circuito>();
    }
    public int getCodigo()
    {
        return this.codigo;
    }
    public void add(Circuito c)
    {
        this.lista.add(c);
    }
    public int tamanho()
    {
        return this.lista.size();
    }
    public ArrayList<Circuito> getLista()
    {
        ArrayList<Circuito> temp = new ArrayList<Circuito>();
        for(Circuito c: this.lista)
        temp.add(c);
        return temp;
    }
    
    public 
    
}
