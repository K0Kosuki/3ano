

public class M2 extends Maquina
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   public M2(int c)
     {
         super(c);
         
     }
     public double consumo(double preco)
     {
         return preco*super.numTasks();
     }

    public M2 clone()
    {
         M2 temp=new M2(super.getCod());
         for(Tarefa t:super.getListTasks())
         temp.add(t);
         return temp;
    }
}
