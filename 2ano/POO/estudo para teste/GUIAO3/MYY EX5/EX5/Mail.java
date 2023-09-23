import java.util.*;
import java.util.GregorianCalendar;
public class Mail
{
    
    private String end;
    private GregorianCalendar datae;
    private GregorianCalendar datar;
    private String ass;
    private String tex;

   
    public Mail(String e, int a,int m,int d,String as,String t)
    {
      this.end=e;
      this.datae = new GregorianCalendar(a,m,d);
      this.datar = new GregorianCalendar();
      this.ass=as;
      this.tex=t;
    }
    public Mail(String en, GregorianCalendar e, GregorianCalendar d, String ass, String texto)
    {
        // construtor de copia
        this.end = en;
        this.datae = (GregorianCalendar)e.clone();
        this.datar = (GregorianCalendar)d.clone();
        this.ass = ass;
        this.tex = texto;
    }

    public String getEnd()
    { return this.end;}
    public String getAss()
    { return this.ass;}
    public String getTex()
    { return this.tex;}
    public GregorianCalendar getDatae()
    {
        return (GregorianCalendar)this.datae.clone();
    }
     public GregorianCalendar getDatar()
    {
        return (GregorianCalendar)this.datar.clone();
    }
  
    public Mail clone()
    {
        return new Mail(this.end,this.datae,this.datar,this.ass,this.tex);
    }
    
}
