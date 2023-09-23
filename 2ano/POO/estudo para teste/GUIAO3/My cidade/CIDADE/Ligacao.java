
/**
 * Write a description of class Ligacao here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ligacao
{
    // instance variables - replace the example below with your own
    private String nome;
    private int dist;

    /**
     * Constructor for objects of class Ligacao
     */
    public Ligacao(String a, int b)
    {
        // inicia variaveis
        this.nome = a; this.dist = b;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getDist()
    {
        // put your code here
        return this.dist;
    }
    public String getNome()
    { return this.nome; }
    
    public boolean equals(Ligacao l)
    {  return this.nome.equals(l.getNome()) && this.dist == l.getDist(); }
    
    public Ligacao clone()
    { return new Ligacao(this.nome, this.dist); }
    
}
