import java.util.GregorianCalendar;
public class Mov 
{
    private GregorianCalendar data;
    private String desc;
    private double valor;

public Mov(int ano,int mes,int dia,String dsc,double val)
{
    this.data = new GregorianCalendar(ano,mes,dia);
    this.desc = dsc;
    this.valor=val;
}
    public GregorianCalendar getData() {
        return data;
    }

}
