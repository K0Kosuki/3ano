
public class Corte extends Maquina implements Componente
{
   public Corte(int c,int t)
   {
       super(c,t);
   }
   
   public double valor()
   {
       double total=0;
       for(Componente c :super.getLista())
           total+=c.custo();
           return total;
   }
   public Corte clone()
   {
       Corte temp = new Corte(super.getCodigo(),super.getTempo());
       for(Componente c :super.getLista())
       temp.add(c);
       return temp;
   }
   
   public int getCod()
   {
       return super.getCodigo();
       
   }
   public double custo()
   {
       return this.valor();
   }
}
