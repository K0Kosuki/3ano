import java.util.*;
public class AgenciaViagens
{
    private HashMap<Integer,Hotel> lista;
    private HashMap<Integer,ArrayList<Integer>> listaN;

    public AgenciaViagens()
    {
        this.lista = new HashMap<Integer,Hotel>();
        this.listaN = new HashMap<Integer,ArrayList<Integer>>();
        
    }
    public void add(Hotel h,int id)
    {
        this.lista.put(id,h.clone());
    }

    public void checkin(int id, int room)
    {
        if(this.lista.containsKey(id))
            this.lista.get(id).add(room);
    }
    public void checkout(int id, int room)
    {
        if(this.lista.containsKey(id))
            this.lista.get(id).remover(room);
    }
    
    public void addEstadia(int nif,int id,int qty)
    {
       if(listaN.containsKey(nif))
       {
           ArrayList<Integer> temp =this.listaN.get(nif);
           for(int x=1;x<=qty;x++)
               temp.add(id);
       }
       else
       {
           ArrayList<Integer> temp = new ArrayList<Integer>();
           for(int x=1;x<=qty;x++)
           temp.add(id);
       }
       
    }
    
    public int mais_barato(int mes,String local)
    {
        double min=Double.MAX_VALUE;
        int minid=0;
        for(Integer i:this.lista.keySet())
        {
            Hotel h=this.lista.get(i);
            if(local.equals(h.getLocal()))
            {
                if(h.dormida(mes)<min)
                min= h.dormida(mes);
                minid=i;
            }
        }
        return minid;
    }
    
    public int mais_barato2(int mes,String local)
    {
        double min=Double.MAX_VALUE;
        int minid=0;
        for(Integer i:this.lista.keySet())
        {
            for(Hotel h:this.lista.values())
        { if(local.equals(h.getLocal()))
            {
                if(h.dormida(mes)<min)
                min= h.dormida(mes);
                minid=i;
            }
        }
        }
        return minid;
    }
    
    public Set<Integer> disponiveis(int id)
    {
       Set<Integer> oc=new TreeSet<Integer>();
       if(this.lista.containsKey(id))
       {
           Hotel h = this.lista.get(id);
           for(Integer i : h.getOcupa())
           {
               if(i==null)
               oc.add(i);
           }
           
       }
       return oc;
    }
    
    public double fatura(int id,int mes)
    {
        double v=0;
        for(Integer i : this.listaN.get(id))
        {
            v+=lista.get(i).dormida(mes);
        }
        return v;
    }
}
