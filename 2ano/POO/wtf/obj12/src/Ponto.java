
public class Ponto
{
    
    // variáveis de instância
    private double x, y;

    // constructores
    Ponto()
    { this.x = 0.0; this.y = 0.0; }
    Ponto(double x, double y)
    { this.x = x; this.y = y; }

    // métodos
    public double getX(){ return this.x;}
    public double getY(){ return this.y;}
    public void setX(double x)
    { this.x = x;}
    public void setY(double y)
    { this.y = y;}
    
    public boolean equals(Ponto p)
    {
        if (p != null)
        return (this.x == p.getX()) && (this.y == p.getY());
        else
            return(false);
    }
    
    public Ponto clone()
    {   return new Ponto(this.x,this.y); }
    
    public String toString()
    {   return(this.x+","+ this.y ); }

    
    
}
