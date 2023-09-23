public abstract class Artigo
{
    private int codigo;
    private double preco;
    
    Artigo()
    {
        this.codigo=0;
        this.preco=0;
    }
    Artigo(int c,double p)
    {
        this.codigo=c;
        this.preco=p;
    }
    
    public int getCodigo()
    {
        return this.codigo;
    }
    public double getPreco()
    {
        return this.preco;
    }
    public void setPreco(double p)
    {
        this.preco=p;
    }
    
    public abstract double comissao();
    public abstract Artigo clone();
    
}