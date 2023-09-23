import java.util.*;
public class Placa
{   
    private int codigo;
    private ArrayList<Circuito> lista;

    public Placa(int c)
    {
        this.codigo = c;
        this.lista = new ArrayList<Circuito>();
    }
    
    public int getCodigo()
    { return this.codigo;}
    
    
    public void add(Circuito c)
    { 
        if(c != null)
            this.lista.add(c.clone()); 
    }
    
    // para ajuda na classe Empresa 2.4)
    public int tamanho()
    { return this.lista.size(); }
    

    public double valor_total()
    {
        double tot = 0.0;
        for(Circuito c: this.lista)
            tot += c.valor();
            
        return tot;
    }
    //alternativa usando iteradores internos
    public double valor_total2()
    { return this.lista.stream().mapToDouble(Circuito :: valor).sum(); }
    
    // metodo para ajudar na resposta a 2.3)
    // agrega todos os componentes usados nesta placa num map: na forma codigo->qty
    // também usado na 2.4)!
    public Map<Integer,Integer> compUsados()
    {
        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
        
        for(Circuito c: this.lista)
            for(Integer i:c.getComponentes())
                if(temp.containsKey(i))
                    temp.put(i,temp.get(i) + c.get(i));
                else
                    temp.put(i,c.get(i));
                
        return temp;
    }
    
    // ajuda para a 2.5)
    // retorna um Map que relaciona codigo circuito com lista de componentes.
    // Componentes estão ordenados!
    public Map<Integer,Set<Integer>> circuComps()
    {
        HashMap<Integer,Set<Integer>> temp = new HashMap<Integer,Set<Integer>>();
        
        for(Circuito c: this.lista)
        {   
            temp.put(c.getCodigo(),c.getComponentes());
        }
            
        return temp;
    }
    
    
    public Placa clone()
    {
        Placa p = new Placa(this.codigo);
        for(Circuito c: this.lista)
            p.add(c); // método add() já faz clone()!!
        
        return p;
    }
}
