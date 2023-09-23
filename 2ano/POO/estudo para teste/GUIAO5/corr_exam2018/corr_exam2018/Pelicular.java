
/**
 * Write a description of class Pelicular here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pelicular extends Circuito
{
    // instance variables - replace the example below with your own
    private double  preco;

    /**
     * Constructor for objects of class Pelicular
     */
    public Pelicular(int c, double p)
    {
        // initialise instance variables
        super(c);
        this.preco = p;
    }

    public double valor()
    {   
        double tot = 0.0;
        for(Integer i: super.getComponentes())
            tot += super.get(i);
            
        return this.preco * (tot / super.tamanho());
    }
    
    public Pelicular clone()
    {
        Pelicular m = new Pelicular(this.getCodigo(), this.preco);
        for(Integer i:super.getComponentes())
            m.add(i,super.get(i));
        return m;
    }
}
