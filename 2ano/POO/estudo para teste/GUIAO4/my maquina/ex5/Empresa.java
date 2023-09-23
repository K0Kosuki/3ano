import java.util.ArrayList;
import java.util.*;
public class Empresa
{
    
    private ArrayList<Maquina> lista;
    
public Empresa()
    {
        // initialise instance variables
        this.lista = new ArrayList<Maquina>();
    }
    public void add(Maquina m)
    {
        if(m!=null)
        this.lista.add(m.clone());
    }
public int maisValor()
{
   
            Maquina maior= this.lista.get(0);
            for(Maquina m: this.lista)
                if(m.valor() > maior.valor())
                    maior = m;
            return maior.getCodigo();
        
}
    
}
