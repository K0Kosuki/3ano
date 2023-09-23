
/**
 * Write a description of class Corte here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Corte extends Maquina implements Componente
{

    /**
     * Constructor for objects of class Corte
     */
    public Corte(int c, int t)
    {
        // initialise instance variables
        super(c,t);
    }

    public double valor()
    {
        double tot = 0.0;
        for(Componente c : super.getLista())
            tot += c.custo();
            
        return tot;
    }
    
    public Corte clone()
    {
        Corte temp = new Corte(super.getCodigo(),super.getTempo());
        for(Componente c: super.getLista())
            temp.add(c);
            
        return temp;
    }
    
    public int getCod()
    {
        return super.getCodigo();
    }
    public double custo()
    {
        return this.valor();
    }
    
}
