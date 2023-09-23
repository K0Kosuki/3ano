

public class Triangulo
{
    // instance variables - replace the example below with your own
    private Ponto p1, p2, p3;

   
    public Triangulo()
    {
        // initialise instance variables
        this.p1 = new Ponto();
        this.p2 = new Ponto();
        this.p3 = new Ponto();
    }
    public Triangulo(double x1,double y1,double x2, double y2, double x3, double y3)
    {
        // initialise instance variables
        this.p1 = new Ponto(x1,y1);
        this.p2 = new Ponto(x2,y2);
        this.p3 = new Ponto(x3,y3);
    }
    public Triangulo(Ponto a1, Ponto a2, Ponto a3)
    {
        // initialise instance variables
        this.p1 = a1.clone();
        this.p2 = a2.clone();
        this.p3 = a3.clone();
    }

    
    private double distancia(Ponto p1, Ponto p2)
    {
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2) + Math.pow(p1.getY()-p2.getY(),2));
    }
    
    public double lado1()
    { return distancia(this.p1,this.p2);}
    public double lado2()
    { return distancia(this.p2,this.p3);}
    public double lado3()
    { return distancia(this.p3,this.p1);}
    
    public double perimetro()
    {
        return this.lado1() + this.lado2() + this.lado3();
    }
    
    public double area()
    {
        double s = this.perimetro() / 2.0;
        return Math.sqrt( s * (s - this.lado1()) * (s - this.lado2()) * (s - lado3()));
    }
    // sets e gets
    public double getP1X()
    { return this.p1.getX();}
    public double getP1Y()
    { return this.p1.getY();}    
    
    
    public boolean equals(Triangulo t)
    {
        if(t != null)
            return this.p1.getX() == t.getP1X() && this.p1.getY() == t.getP1Y(); // && ....
        else
            return false;
    }
    
    public Triangulo clone()
    {
        return new Triangulo(this.p1,this.p2,this.p3);
    }
    
    public String toString()
    {
        return this.p1.toString()+","+this.p2.toString()+","+this.p3.toString();
    }
}
