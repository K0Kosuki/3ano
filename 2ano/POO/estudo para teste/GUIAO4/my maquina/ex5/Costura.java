import java.util.ArrayList;
import java.util.*;
public class Costura extends Maquina implements Componente
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   private double preco;
    
    public Costura(int c,int t,double p)
    {
      super(c,t);
      this.preco=p;
    }
    
   public double valor()
   {
       double total=0;
       ArrayList<Componente> temp= new ArrayList<Componente>();
       for(Componente c:super.getLista())
       total +=c.custo();
       return this.preco+(total/2);
   }
   
   public double custo()
   {
       return this.valor();
   }
   public Costura clone()
   {
       Costura temp = new Costura(super.getCodigo(),super.getTempo(),this.preco);
       for(Componente c :super.getLista())
       temp.add(c);
       return temp;
       
   }
   
   public int getCod()
   {
       return super.getCodigo();
   }
}
