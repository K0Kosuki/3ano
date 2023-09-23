import java.util.*;

public class Fabrica
{
    private HashMap<Integer,Maquina> lista;
    
    public Fabrica()
    {
        this.lista = new  HashMap<Integer,Maquina>();
    }
    
  
    public void JaexisteMaqExcepiton(Maquina m)
    {
        if(this.lista.containsKey(m.getCod()))
        {
            
        }
        else
        {
            this.lista.put(m.getCod(),m.clone());
        }
        
    }
    
    public Set<Integer> max_consumo(double preco)
    {
        
        int maxcod=0;
        double max=0;
        for(Maquina m : this.lista.values())
        {
            if(m.consumo(preco) > max)
            max=m.consumo(preco);
            maxcod= m.getCod();
            
        }
        
        HashSet<Integer> maxlista = new HashSet<Integer>();
        for(Tarefa t:this.lista.get(maxcod).getListTasks())
        {
            maxlista.add(t.getNumCli());
            
        }
        
        return maxlista;
    }
    
    public Map<Integer,List<Integer>> maqDoCli()
    {
        int nc=0;
        
        HashMap<Integer,List<Integer>> lista = new HashMap<Integer,List<Integer>>();
        for(Maquina m :this.lista.values())
        {
         for(Tarefa t:m.getListTasks())
         {
             nc = t.getNumCli();
             if(lista.containsKey(nc))
             {
                 lista.get(nc).add(m.getCod());
             }
             else
             {
                 ArrayList<Integer> temp = new ArrayList<Integer>();
                 temp.add(m.getCod());
                 lista.put(nc,temp);
             }
         }
        }
        return lista;
    }
    
    public int maior()
    {
        int mais= 0;
        int maiscod=0;
        for(Maquina m : this.lista.values())
        {
            for(Tarefa f : m.getListTasks())
            {
                if()
            }
        }
    }
}
