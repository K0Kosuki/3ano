
/**
 * Write a description of class Monolitico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monolitico extends Circuito
{
    

    /**
     * Constructor for objects of class Monolitico
     */
    public Monolitico(int c)
    {
        // initialise instance variables
        super(c);
    }

    public double valor()
    {
        double tot = 0.0;
        for(Integer i:super.getComponentes())
            tot += Tabela.precos(i) * super.get(i);
        
        return tot;
    }
    public Monolitico clone()
    {
        Monolitico m = new Monolitico(this.getCodigo());
        for(Integer i:super.getComponentes())
            m.add(i,super.get(i));
        return m;
    }
}
