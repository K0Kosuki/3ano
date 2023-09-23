import java.util.*;

public class Empresa
{
    private HashMap<Integer,Servico> lista;
    
    public Empresa()
    {
     this.lista = new HashMap<Integer,Servico>();
    }
    
    public void add(Servico s) throws Except
    {
        if(this.lista.containsKey(s.getCodigo()))
        throw new Except("ja exite");
        else
        this.lista.put(s.getCodigo(),s.clone());
    }
    
    public String mais_prestadores()
    {
        int max=0;
        String maxs="";
        for(Servico s:this.lista.values())
        {
            if(s.tam_presta()> max)
            max= s.tam_presta();
            maxs=s.getClass().getName();
        }
        return maxs;
    }
  
    public Map<Integer,ArrayList<Servico>> cliente_servicos()
    {
        HashMap<Integer,ArrayList<Servico>> temp = new HashMap<Integer,ArrayList<Servico>>();
        for(Servico s : this.lista.values())
        {
            if(temp.containsKey(s.getCli()))
            {
                temp.get(s.getCli()).add(s.clone());
            }
            else
            {
            ArrayList<Servico> lis =new ArrayList<Servico>();
            lis.add(s.clone());
            temp.put(s.getCli(),lis);
            }
        }
        return temp;
    }
    
    public Map<Integer,TreeSet<Integer>> prestadores_servicos()
    {
        TreeMap<Integer,TreeSet<Integer>> map = new TreeMap<Integer,TreeSet<Integer>>();
        for(Servico s: this.lista.values())
        {
            for(Integer i : s.getListaPrest())
            {
                if(map.containsKey(i))
                {
                    map.get(i).add(s.getCli());
                }
                else
                {
                    TreeSet<Integer> lis =new TreeSet<Integer> ();
                    lis.add(s.getCli());
                    map.put(i,lis);
                }
            }
        }
        return map;
    }
    
    public int mais()
    {
        HashMap<Integer,Double> temp = new HashMap<Integer,Double>();
        for(Servico s:this.lista.values())
        {
        for(Integer i:s.getListaPrest())
            if(temp.containsKey(i))
            {
                double cc = s.custo()+temp.get(i);
                temp.put(i,cc);
            }
            else
            {
                temp.put(i,s.custo());
            }
        }
        int maxi=0;
        double max=0;
        for(Integer i:temp.keySet())
        {
            if(max<temp.get(i))
            max=temp.get(i);
            maxi=i;
        }
        return maxi;
    }
}
