import java.util.*;
public class Registar
{
    
    private int km;
    private int tempo;
    private ArrayList<Crometro> lista;

    public Registar(int k,int t)
    {
        this.km=k;
        this.tempo=t;
        this.lista = new ArrayList<Crometro>();
    }
    
    public int getKm()
    {
        return this.km;
    }
    public int getTempo()
    {
        return this.tempo;
    }
  
    
}
