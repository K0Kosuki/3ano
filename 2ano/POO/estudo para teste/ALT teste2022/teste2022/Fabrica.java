import java.util.*;

public class Fabrica
{
    private HashMap<Integer,Maquina> maq;
    
    public Fabrica()
    {
        this.maq = new HashMap<Integer,Maquina>();
    }
    public void add(Maquina m) throws JaexiteMaqException
    {
        if(maq.containsKey(m.getCod()))
        {
          throw new  JaexiteMaqException("ja existe");
        }
        else
        {
            this.maq.put(m.getCod(),m.clone());
        }
    }
    
    public Set<Integer> max_consumo(double preco)
    {
      double max=0;
      double maxcod=0;
      TreeSet<Integer> lista = new TreeSet<Integer>();
      
      for(Maquina m:this.maq.values())
      {
          if(m.consumo(preco)>max)
          max=m.consumo(preco);
          maxcod=m.getCod();
      }
      
      for(Tarefa t : this.maq.get(maxcod).getListTasks() )
      {
          lista.add(t.getNumCli());
      }
      return lista;
    }
    
    public Map<Integer,List<Integer>> maqDoCli()
    {
         
      HashMap<Integer,List<Integer>> mapa= new HashMap<Integer,List<Integer>>();
       for(Maquina m:this.maq.values())
       {
          
          for(Tarefa t: m.getListTasks())
          {
              if(mapa.containsKey(t.getNumCli()))
              mapa.get(t.getNumCli()).add(m.getCod());
              else
              {
              ArrayList<Integer> lista = new ArrayList<Integer>();
              lista.add(m.getCod());
              mapa.put(t.getNumCli(),lista);
            }
          }
       }
       return mapa;
    }
    
    public int maisCli()
    {
        int mais=0;
        
        int nc=0;
        TreeSet<Integer> temp = new TreeSet<Integer>();
        for(Maquina m : this.maq.values())
        {
            temp.clear();
           for(Tarefa t : m.getListTasks())
           {
                temp.add(t.getNumCli());
               
           }
           if(temp.size()>mais)
               {
               mais = temp.size();
               nc=m.getCod();
                }
           
        }
        return nc;
    }
    public int maxDura()
    {
        int maxd=0;
     HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
        int maxc=0;
        for(Maquina m : this.maq.values())
        {
           for(Tarefa t: m.getListTasks())
           {
               int num = t.getNumCli();
               if(temp.containsKey(num))
               {
                   temp.put(num,temp.get(num)+(t.duracao()));
               }
               else
               temp.put(num,t.duracao());
           }
            for(Integer i: temp.keySet())
                if(temp.get(i) > maxd)
                { maxd = temp.get(i); maxc = i; }
        }
        return maxc;
    }
}