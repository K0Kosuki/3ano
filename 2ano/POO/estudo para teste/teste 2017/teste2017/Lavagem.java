import java.util.*;
public class Lavagem extends Servico
{
      private static double valor = 1.5;
      private int agua;
      private int dura;
    public Lavagem(int c,int cl,int a,int d)
      {
          super(c,cl);
          this.agua=a;
          this.dura=d;
      }
    public int getAgua()
    {
        return this.agua ;
    }
    public int getDura()
    {
        return this.dura;
    }
        
      
      public double custo()
      {
          return Lavagem.valor *this.getAgua();
      }
      
      public Lavagem clone()
      {
          Lavagem temp = new Lavagem(super.getCodigo(),super.getCli(),this.agua,this.dura);
          for(Integer i:super.getListaPrest())
          temp.add(i);
          return temp;
      }
     
}
