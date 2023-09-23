import java.util.ArrayList;
import java.util.*;

public class Legumes extends Estufa 
{
    private static int valorL=200;
    private int altura;
    private String nome;
    
    
    public Legumes(int area,int codigo,int max,int min,String n,int h)
    {
     super(area,codigo,max,min);
     this.nome=n;
     this.altura = h;
    }
    public int getAltura()
    {
        return this.altura;
    }
    public String getNome()
    {
        return this.nome;
    }
    public static int getValorL()
    {
     return valorL;   
    }
    
    public double Total()
    {
        return Legumes.getValorL()*super.getArea();
    }
    
    public Legumes clone()
    { Legumes t = new Legumes(super.getCodigo(), super.getArea(), super.getMin(), super.getMax(),this.nome,this.altura);
      return t;
    }
}
