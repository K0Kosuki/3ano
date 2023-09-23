
import java.util.*;
public class Maillist
{
    
    private String end;
    private GregorianCalendar datae;
    private GregorianCalendar datar;
    private ArrayList<Mail> lista;
    
    public Maillist(String e,int a,int m,int d)
    {
      this.end=e;
      this.datae = new GregorianCalendar(a,m,d);
      this.datar = new GregorianCalendar();
      this.lista = new ArrayList<Mail>();
    }
    public String getEnd()
    { return this.end;}
    public GregorianCalendar getDatae()
    {
        return (GregorianCalendar)this.datae.clone();
    }
     public GregorianCalendar getDatar()
    {
        return (GregorianCalendar)this.datar.clone();
    }
    
    public void add(String e, int a,int m,int d,String as,String t)
    {
        this.lista.add(new Mail( e,a,m,d,as,t));
    }
    
    public int total()
    {
        return this.lista.size();
    }
    
    public int Mesmo_end(String end)
    {
        int c=0;
        for(Mail m : this.lista)
        {
            if(end == m.getEnd())
            {
            c++;
            }
        }
        return c;
    }
    
    public ArrayList<Mail> palavra (String e, int a,int m,int d,String as,String t)
    {
        ArrayList<Mail> p = new ArrayList<Mail>();
        for(Mail mail :this.lista)
        {
            if(as == mail.getAss())
            {
               p.add(new Mail(e,a,m,d,as,t));
            }
        }
        return p;
    }
    
    public void elim_data_ante(int a,int m ,int d)
    {   
        GregorianCalendar data = new GregorianCalendar(a,m,d);
        for(Mail mail:this.lista)
            if(mail.getDatar().getTimeInMillis()<data.getTimeInMillis())
            this.lista.remove(mail);
    }
    
    public void elim_data_i(int a,int m,int d)
    {
        Mail mail =null;
        GregorianCalendar data = new GregorianCalendar(a,m,d);
        long data2 = data.getTimeInMillis();
        Iterator<Mail> i = this.lista.iterator();
        while(i.hasNext())
        {
            mail = i.next();
            if(mail.getDatar().getTimeInMillis()< data2)
            i.remove();
        }
        
    }
    
     public ArrayList<Mail> mailsDia()
    {
        ArrayList<Mail> temp = new ArrayList<Mail>();
        GregorianCalendar hoje = new GregorianCalendar();
        int ano = hoje.get(Calendar.YEAR); 
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        for(Mail m:this.lista)
            if(m.getDatar().get(Calendar.YEAR) == ano && m.getDatar().get(Calendar.MONTH) == mes &&
            m.getDatar().get(Calendar.DAY_OF_MONTH) == dia)
                temp.add(m.clone());
                 
        return temp;    
    }
    
}
