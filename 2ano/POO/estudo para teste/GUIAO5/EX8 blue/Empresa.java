
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
        this.veiculos.put(v.getMatricula().v.clone());
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
    
    public String veiculoComMaisKms(){
        for(Veiculo v:this veiculos.values
    }
    
    }
    
    
}