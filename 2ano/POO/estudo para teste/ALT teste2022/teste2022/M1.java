import java.util.*;
public class M1 extends Maquina
{
 
     public M1(int c)
     {
         super(c);
         
     }
    
     public double consumo(double preco)
     {
         double c=0;
         for(Tarefa t:super.getListTasks())
         {
             c+=preco*t.duracao();
         }
         return c;
     }
    
     
     public M1 clone()
     {
         M1 temp=new M1(super.getCod());
         for(Tarefa t:super.getListTasks())
         temp.add(t);
         return temp;
     }
}
