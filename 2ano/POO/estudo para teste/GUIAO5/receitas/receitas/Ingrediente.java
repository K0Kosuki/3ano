
/**
 * Write a description of class Ingrediente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ingrediente
{
    // instance variables - replace the example below with your own
    private String nome;
    private int qty;
    private String uni;
    private int cal;

    /**
     * Constructor for objects of class Ingrediente
     */
    public Ingrediente(String n, int q, String u, int c)
    {
        this.nome = n;
        this.qty = q;
        this.uni = u;
        this.cal = c;
    }

    public String getNome()
    { return this.nome;}
    public int getQty()
    { return this.qty;}
    public String getUni()
    { return this.uni;}
    public int getCal()
    { return this.cal;}
    
    public boolean equals(Object i)
    {
        if(i == null)
            return false;
        Ingrediente ii = (Ingrediente)i;
        return(this.nome.equals(ii.getNome()));
    }
    
    public Ingrediente  clone()
    { return new Ingrediente(this.nome,this.qty,this.uni,this.cal); }
}
