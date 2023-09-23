
/**
 * Write a description of class M1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class M1 extends Maquina
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class M1
     */
    public M1(int n)
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
        // put your code here
        int tempo = 0;
        for(Tarefa t: super.getListTasks())
            tempo += t.duracao();
        return preco * tempo;
    }
    
    public M1 clone()
    {
        M1 novo = new M1(super.getCod());
        for(Tarefa t: super.getListTasks())
            novo.add(t);
        return novo;
    }
}
