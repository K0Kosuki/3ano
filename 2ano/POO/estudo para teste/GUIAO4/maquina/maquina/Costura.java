
/**
 * Write a description of class Costura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Costura extends Maquina
{
    // instance variables - replace the example below with your own
    private double preco;

    /**
     * Constructor for objects of class Costura
     */
    public Costura(int c, int t, double p)
    {
        // initialise instance variables
        super(c,t);
        this.preco = p;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double valor()
    {
        double tot = 0.0;
        for(Componente c : super.getLista())
            tot += c.custo();
            
        return this.preco + 0.5 * tot;
    }
    
    public Costura clone()
    {
        Costura temp = new Costura(super.getCodigo(),super.getTempo(),this.preco);
        for(Componente c: super.getLista())
            temp.add(c);
            
        return temp;
    }
}
