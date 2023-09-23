
/**
 * Write a description of class CPrazo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CPrazo extends Conta2
{
    // instance variables - replace the example below with your own
    private int prazo;
    private double taxa;

    /**
     * Constructor for objects of class CPrazo
     */
    public CPrazo(int a, int m, int d, String tit, double saldo, int pr, double t)
    {
        // initialise instance variables
        super(a,m,d,tit,saldo);
        this.prazo = pr;
        this.taxa = t;
    }

    
}
