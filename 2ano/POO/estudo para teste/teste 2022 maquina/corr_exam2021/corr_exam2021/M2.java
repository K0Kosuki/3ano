
/**
 * Write a description of class M2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class M2 extends Maquina
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class M1
     */
    public M2(int n)
    {
        // initialise instance variables
        super(n);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double consumo(double preco)
    {
        return preco * super.numTasks();
    }
    
    public M2 clone()
    {
        M2 novo = new M2(super.getCod());
        for(Tarefa t: super.getListTasks())
            novo.add(t);
        return novo;
    }
}
