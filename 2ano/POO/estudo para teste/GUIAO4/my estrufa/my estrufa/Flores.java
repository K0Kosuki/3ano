import java.util.*;

public class Flores extends Estufa{
   
    private String nome;
    private static int valorFL=20;
    private ArrayList<String> core;

    public Flores(int area,int codigo,int max,int min,String n)
    {
        super(area,codigo,max,min);
        this.nome=n;
        this.core = new ArrayList<String>();
    }

    public void add(String c)
    {
     this.core.add(c);   
    }
    
    public static int getValorFL()
    { 
        return valorFL;
    }
    
    public static void setValorFL(int valo)
    {
       valorFL=valo;
    }
    
    public double Total()
    {
        return super.getArea()* Flores.getValorFL() ;
    }
    
    public Flores clone()
    { Flores t = new Flores(super.getCodigo(), super.getArea(), super.getMin(), super.getMax(),this.nome);
      for(String a:this.core)
          t.add(a);
      return t;
    }
    
}
