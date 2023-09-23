import java.util.*;
/**
 * Write a description of class Mail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mail
{
    // instance variables - replace the example below with your own
    private String end;
    private GregorianCalendar datae;
    private GregorianCalendar datar;
    private String subjet;
    private String texto;

    /**
     * Constructor for objects of class Mail
     */
    
    public Mail(String e, int ano, int mes, int dia, String ass, String texto)
    {
        // initialise instance variables
        this.end = e;
        this.datae = new GregorianCalendar(ano,mes,dia);
        this.datar = new GregorianCalendar();
        this.subjet = ass;
        this.texto = texto;
    }
    
    public Mail(String en, GregorianCalendar e, GregorianCalendar d, String ass, String texto)
    {
        // construtor de copia
        this.end = en;
        this.datae = (GregorianCalendar)e.clone();
        this.datar = (GregorianCalendar)d.clone();
        this.subjet = ass;
        this.texto = texto;
    }

    public String getEnd()
    { return this.end;}
    public String getSubjet()
    { return this.subjet;}
    public String getTexto()
    { return this.texto;}
    
    public GregorianCalendar getDatae()
    { return (GregorianCalendar)this.datae.clone();}
    
    public GregorianCalendar getDatar()
    { return (GregorianCalendar)this.datar.clone();}
    
    public boolean existe(String a)
    { return this.subjet.indexOf(a) != -1;  }
    
    public Mail clone()
    { return new Mail(this.end,this.datae,this.datar,this.subjet,this.texto);}
    
    public boolean equals(Mail m)
    { return m.getEnd().equals(this.end) && m.getSubjet().equals(this.subjet) && m.getTexto().equals(this.texto)
        && m.getDatae().equals(this.datae) && m.getDatar().equals(this.datar); }
}
