
public class M1 extends Maquina
{
   private double preco;
   
   public M1(int c,double p)
   {
       super(c);
       this.preco=p;
   }
   public double getPreco()
    {
        return this.preco;
    }
  
   public double consumo(double preco)
   {
        int dura = 0;
        
        for(Tarefa t: super.getListTasks())
            dura += t.duracao();
        
        return this.getPreco() * dura;
   }
   
   public M1 clone()
   {
       M1 temp = new M1(super.getCod(),this.preco);
       for(Tarefa t:super.getListTasks())
       temp.add(t);
       return temp;
   }
  
}
