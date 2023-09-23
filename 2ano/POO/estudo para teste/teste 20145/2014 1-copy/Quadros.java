public class Quadros extends Artigo
{
   public Quadros(int c,double p)
   {
       super(c,p);
   }
   
   public double comissao()
   {
       return 0.1*super.getPreco();
   }
   public Quadros clone()
   {
       Quadros temp = new Quadros(super.getCodigo(),super.getPreco());
       return temp;
   }
}
