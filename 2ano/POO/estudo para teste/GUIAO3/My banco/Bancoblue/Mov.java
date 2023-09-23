import java.util.GregorianCalendar;

public class Mov {
    private GregorianCalendar data;
    private String descri;
    private double valor;
    
    public Mov(int a,int m ,int d,String des,double val){
        this.data = new GregorianCalendar(a,m,d);//创建一个data对象
        this.descri=des;
        this.valor=val;
    }
    public int getDia(){
        return this.data.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public int getMes() {
        return this.data.get(GregorianCalendar.MONTH);
    }
    public int getAno() {
        return this.data.get(GregorianCalendar.YEAR);
    }
    
    public String getDes(){
        return this.descri;
    }
    public double getValor()
    { return this.valor; }

    public String getData(){
        return  this.getDia()+"/"+this.getMes()+"/"+this.getAno();
    }
}
