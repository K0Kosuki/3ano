
/**
 * Write a description of class Fabrica here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Fabrica
{
    
    // instance variables - replace the example below with your own
    // 2.1
    private HashMap<Integer,Maquina> maqs;

    /**
     * Constructor for objects of class Fabrica
     */
    public Fabrica()
    {
        // initialise instance variables
        this.maqs = new HashMap<Integer,Maquina>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void add(Maquina nova) throws JaexisteMaqException
    {
        // put your code here
        if(this.maqs.containsKey(nova.getCod()))
            throw new JaexisteMaqException("codigo já existe");
        else
            this.maqs.put(nova.getCod(),nova.clone());
    }
    
    // 2.2
    public Set<Integer> max_consumo(double preco)
    {
        // encontrar maq com consumo max
        int cod = 0;
        double cons = 0.0;
        for(Maquina m: this.maqs.values())
            if(m.consumo(preco) > cons)
            { cons = m.consumo(preco); cod = m.getCod();}
            
        // colecionar todos os clientes dessa maq
        TreeSet<Integer> temp = new TreeSet<Integer>();
        for(Tarefa t: this.maqs.get(cod).getListTasks())
            temp.add(t.getNumCli());
            
        return temp;
    }
    
    // 2.3
    public Map<Integer,List<Integer>> maqDoCli()
    {
        HashMap<Integer,List<Integer>> nova = new HashMap<Integer,List<Integer>>();
        
        for(Maquina m: this.maqs.values())
            for(Tarefa t: m.getListTasks())
            {
                int num = t.getNumCli();
                if(nova.containsKey(num))
                    nova.get(num).add(m.getCod());
                else
                {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(m.getCod());
                    nova.put(num,temp);
                }   
                    
            }
        
        return nova;
    }
    
    // 2.4
    public int maxMaq()
    {
        int cod = 0;
        int tam = 0;
        TreeSet<Integer> temp = new TreeSet<Integer>();
        for(Maquina m: this.maqs.values())
        {
            // calcula #clientes
            for(Tarefa t: m.getListTasks())
                temp.add(t.getNumCli());
                
            if(temp.size() > tam)
            { tam = temp.size(); cod = m.getCod();}
            
            temp.clear();
        }
        
        return cod;
    }
    
    // 2.5
    public int maxDura()
    {
        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>(); // associa cliente a soma das durações
        
        int nc = 0, max = 0;
        for(Maquina m: this.maqs.values())
        {
            // calcula para cada máquina 
            // o max de duracao para um cliente
            for(Tarefa t: m.getListTasks())
            {
                int num = t.getNumCli();
                if(temp.containsKey(num))
                    temp.put(num,temp.get(num) + t.duracao());
                else
                    temp.put(num,t.duracao());    
            }
            
            for(Integer i: temp.keySet())
                if(temp.get(i) > max)
                { max = temp.get(i); nc = i; }
                
            temp.clear();
            
        }
        
        return nc;
    }
}
