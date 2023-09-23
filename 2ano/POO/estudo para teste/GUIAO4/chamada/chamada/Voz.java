
/**
 * Write a description of class Voz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Voz extends Chamada
{
    // instance variables - replace the example below with your own
    private boolean happy_hour;

    /**
     * Constructor for objects of class Voz
     */
    public Voz(int o, int d, double p, boolean h)
    {
        // initialise instance variables
        super(o,d,p);
        this.happy_hour = h;
    }
    
    public void setHappy_hour(boolean h)
    { this.happy_hour = h;}
    public boolean getHappy_hour()
    { return this.happy_hour;}
    
    public double valor()
    {
        if(this.happy_hour)
            return super.getDuracao() * 0.1;
        else
            return super.getDuracao() * super.getPreco() / 60.0;    
    }
    
    public Voz clone()
    { return new Voz(super.getOrigem(),super.getDuracao(),super.getPreco(),this.happy_hour); }
    
}
