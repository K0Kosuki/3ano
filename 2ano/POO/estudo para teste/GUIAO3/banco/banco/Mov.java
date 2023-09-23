
/**
 * Write a description of class Mov here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.GregorianCalendar;
public class Mov
{
    // instance variables - replace the example below with your own
    private GregorianCalendar data;
    private String desc;
    private double valor;

    /**
     * Constructor for objects of class Mov
     */
    
    public Mov(int a, int m, int d, String dsc, double v)
    {
        // initialise instance variables
        this.data = new GregorianCalendar(a,m,d);
        this.desc = dsc;
        this.valor = v;
    }
    public Mov(GregorianCalendar d, String dsc, double v)
    {
        // initialise instance variables
        this.data = (GregorianCalendar)d.clone();
        this.desc = dsc;
        this.valor = v;
    }
    public Mov(String dsc, double v)
    {
        // initialise instance variables
        this.data = new GregorianCalendar();
        this.desc = dsc;
        this.valor = v;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getData()
    {
        // put your code here
        return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
    }
    
    public GregorianCalendar getGdata()
    {
        // put your code here
        return (GregorianCalendar)this.data.clone();
    }
    
    
    public int getDia()
    { return this.data.get(GregorianCalendar.DAY_OF_MONTH); }
    public int getMes()
    { return this.data.get(GregorianCalendar.MONTH); }
    public int getAno()
    { return this.data.get(GregorianCalendar.YEAR); }
    
    public String getDesc()
    { return this.desc; }
    public double getValor()
    { return this.valor; }
    
    public boolean equals(Mov v)
    {
        return this.getData().equals(v.getData()) && this.desc.equals(v.getDesc()) 
        && this.valor == v.getValor();
    }
    
    public Mov clone()
    { return new Mov(this.data, this.desc, this.valor); }
}
