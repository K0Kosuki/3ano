
/**
 * Write a description of class Exemplo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exemplo implements Tarefa
{
    // instance variables - replace the example below with your own
    private int num,d;

    /**
     * Constructor for objects of class Exemplo
     */
    public Exemplo(int x, int y)
    {
        // initialise instance variables
        this.num = x; this.d = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getNumCli()
    {
        // put your code here
        return this.num;
    }
    public int duracao()
    { return this.d;}
}
