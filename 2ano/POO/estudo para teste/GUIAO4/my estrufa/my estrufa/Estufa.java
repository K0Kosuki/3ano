
public abstract class Estufa
{
   
    private int area;
    private int codigo;
    private int max,min;

   

    public Estufa(int a, int c, int mx, int mi)
    {
      this.area=a;this.codigo=c;this.max=mx;this.min=mi;
    }
    public int getArea(){
        return this.area;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public int getMax(){
        return this.max;
    }
    public int getMin() {
        return this.min;
    }
        
    public abstract double Total();
    public abstract Estufa clone();
    public boolean emRisco(int temp)
    {
        return(temp >this.max || temp<this.min);
    }
    
   
   
}
