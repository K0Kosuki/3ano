
/**
 * Write a description of class SMS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SMS extends Chamada
{
    // instance variables - replace the example below with your own
    private String texto;

    /**
     * Constructor for objects of class SMS
     */
    public SMS(int o, int d, double p, String t)
    {
        // initialise instance variables
        super(o,d,p);
        this.texto = t;
    }

    public String getTexto()
    { return this.texto;}
    
    public int getDuracao()
    { return this.texto.length();}
    
    public double valor()
    { return this.getDuracao() * 0.001;}
    
    public SMS clone()
    { return new SMS(super.getOrigem(),super.getDuracao(),super.getPreco(),this.texto);}
    
}
