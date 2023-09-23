import java.util.*;
public class Empresa
{
   private String nomeEmpresa;
   private TreeMap<String, Veiculo> veiculos;


  
    public Empresa(String nomeE)
    {
        this.nomeEmpresa=nomeE;
        this.veiculos= new TreeMap<String,Veiculo>();
    }

    public void add(Veiculo v){
        if(v!=null)
        this.veiculos.put(v.getMatricula(),v.clone());
    }
    
    public double ValorTodosContrados()
    {
        double total=0;
        for(Veiculo v:this.veiculos.values())
        {
            ArrayList<Contratavel> lista=v.getServico();
            for(Contratavel c:lista)
                total+=v.custoPorContrato(c);
        }
        return total;
    }
    
    public Map<String,ArrayList<Veiculo>> veiculosPorCliente()
    {
        HashMap<String,ArrayList<Veiculo>> lista = new HashMap<String,ArrayList<Veiculo>>();
        for(Veiculo v:this.veiculos.values())
        {
            ArrayList<Contratavel> temp = v.getServico();
            for(Contratavel c:temp)
                if(lista.containsKey(c.getCliente()))
                    lista.get(c.getCliente()).add(v.clone());
                    else
                    {
                        ArrayList<Veiculo> tmp = new ArrayList<Veiculo>();
                        tmp.add(v.clone());
                        lista.put(c.getCliente(),tmp);
                    }
        }
        return lista;
    }
    
    public String VeiculoComMaisKms()
    {
        int max =0;
        String mm=null;
        
        for(Veiculo v : this.veiculos.values())
        {
            ArrayList<Contratavel> temp=v.getServico();
            int total=0;
            for(Contratavel c:temp)
                total +=c.getDistancia();
                if(total>max)
                {
                max=total;
                    mm=v.getMatricula();
                }
        }
        return mm;
    }
    
    public boolean existeServicoComDistanciaMaior(double dist)
    {
        
        boolean ha = false;
        Iterator<Veiculo> i= this.veiculos.values().iterator();
        while(i.hasNext() && !ha)
        {
            ArrayList<Contratavel> temp = i.next().getServico();
            Iterator<Contratavel> i2 = temp.iterator();
            while(
        }
    }

    

    
    
}
    