
/**
 * Write a description of class Parafuso here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parafuso implements Componente
{
    // instance variables - replace the example below with your own
    private int codigo;
    private double preco;

    /**
     * Constructor for objects of class Parafuso
     */
    public Parafuso(int c, double p)
    {
        // initialise instance variables
        this.codigo = c; this.preco = p;
    }

    public int getCod()
    { return this.codigo; }
    public double custo()
    {
        return 2.0 * this.preco;
    }
}
