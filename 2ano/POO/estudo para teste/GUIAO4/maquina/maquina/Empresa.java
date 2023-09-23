
/**
 * Write a description of class Empresa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Empresa
{
    // instance variables - replace the example below with your own
    private ArrayList<Maquina> maqs;

    /**
     * Constructor for objects of class Empresa
     */
    public Empresa()
    {
        // initialise instance variables
        this.maqs = new ArrayList<Maquina>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void add(Maquina m)
    {
        // put your code here
        if(m != null)
            this.maqs.add(m.clone());
    }
    
    public int maisValor()
    {
        if(this.maqs.size() > 0)
        {
            Maquina m = this.maqs.get(0);
            for(Maquina x: this.maqs)
                if(x.valor() > m.valor())
                    m = x;
            return m.getCodigo();
        }
        else
            return -1;
    }
}
