

public class Mobilias extends Artigo
{
    private double pre;
    public Mobilias(int c,double p,double pr)
    {
       super(c,p);
       this.pre = pr;
    }
    public double getPrecen()
    {
        return this.pre;
    }
    public void setPrecen(double p)
    {
        this.pre=p;
    }
    public double comissao()
    {
        return this.getPrecen()*super.getPreco();
    }
    
    public Mobilias clone()
    {
        Mobilias temp = new Mobilias(super.getCodigo(),super.getPreco(),this.pre);
        return temp;
    }
}
