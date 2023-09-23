

public class Pelicular extends Circuito
{

    private double  preco;
    public Pelicular(int c,double p)
    {
      super(c);
      this.preco = p;
    }
 
    public double valor()
    {
        double total=0;
        for(Integer i : super.getComponentes())
        total= super.get(i);
        return this.preco*(total/super.tamanho());
    }
 public Pelicular clone()
    {
        Pelicular m = new Pelicular(this.getCodigo(), this.preco);
        for(Integer i:super.getComponentes())
            m.add(i,super.get(i));
        return m;
    }
}
