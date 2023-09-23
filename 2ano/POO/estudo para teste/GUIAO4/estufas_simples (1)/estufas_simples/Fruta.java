import java.util.*;
/**
 * Write a description of class Fruta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruta extends Estufa implements Cardinal
{
    // instance variables - replace the example below with your own
    private ArrayList<String> nomes;
    
    // vars e métodos de classe
    private static int valor = 10;
    
    public static int getValor()
    { return valor;}
    public static void setValor(int v)
    { valor = v;}
    
    /**
     * Constructor for objects of class Fruta
     */
    public Fruta(int c, int a, int mi, int ma)
    {
        // initialise instance variables
        super(c,a,mi,ma);
        this.nomes = new ArrayList<String>();
    }

    public void addFruta(String a)
    { this.nomes.add(a);}
    
    public double valorTotal()
    { return super.getArea() * Fruta.getValor();}
    
    public Fruta clone()
    { Fruta t = new Fruta(super.getCodigo(), super.getArea(), super.getMin(), super.getMax());
      for(String a:this.nomes)
          t.addFruta(a);
      return t;
    }
    
    public int cardinalidade()
    { return this.nomes.size();}
}
