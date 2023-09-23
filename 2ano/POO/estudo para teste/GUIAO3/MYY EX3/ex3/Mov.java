import java.util.*;
import java.util.GregorianCalendar;
public class Mov
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double valor;
    private String descricao;
   private GregorianCalendar data;
   
    public Mov(double v,String des,int a,int m,int d)
    {
        this.valor = v;
        this.descricao=des;
        this.data = new GregorianCalendar(a,m,d);
    }

    public double getValor()
    {
        return this.valor;
    }
    public String getDes()
    {
        return this.descricao;
    }
    public GregorianCalendar getData()
    {
        return (GregorianCalendar)this.data.clone();
    }
    
    
    
    
}
