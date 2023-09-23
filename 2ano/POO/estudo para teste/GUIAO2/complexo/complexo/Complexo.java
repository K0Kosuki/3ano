
/**
 * Write a description of class Complexo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Complexo
{
    // instance variables - replace the example below with your own
    private double real, imag;

    /**
     * Constructor for objects of class Complexo
     */
    public Complexo()
    { this.real = 0.0; this.imag = 0.0; }
    
    public Complexo(double a, double b)
    {
        // initialise instance variables
        this.real = a;  this.imag = b;
    }

    public double getReal()
    { return this.real;}
    public double getImag()
    { return this.imag;}
    
    public void setReal(double a)
    { this.real = a;}
    public void setImag(double b)
    { this.imag = b;}
    
    
    public Complexo soma(Complexo c)
    {
        return new Complexo(this.real + c.getReal(), this.imag + c.getImag());
    }
    
    public Complexo multi(Complexo c)
    {
        double temp1 = (this.real * c.getReal()) - (this.imag * c.getImag());
        double temp2 = (this.imag * c.getReal()) + (this.real * c.getImag());
        
        return new Complexo(temp1,temp2);
    }
    
    public Complexo conjugado()
    { return new Complexo(this.real, -1.0 * this.imag); }
    
    public String polar()
    {
        double r = Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imag,2));
        double phi = Math.atan(this.imag / this.real);
        
        return r + " * (cos " +phi+" + sen "+phi+" i)"; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean equals(Complexo c)
    { return this.real == c.getReal() && this.imag == c.getImag(); }
    
    public String toString()
    { return this.real + "+" + this.imag + "i"; }
    
    public Complexo clone()
    { return new Complexo(this.real, this.imag); }
}
