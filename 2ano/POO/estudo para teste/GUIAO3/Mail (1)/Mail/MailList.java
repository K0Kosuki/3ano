
/**
 * Write a description of class MailList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Versão usando ArrayList e uma única classe
 * que associa o endereço com a lista.
 */
import java.util.*;
public class MailList
{
    // instance variables - replace the example below with your own
    private String end; 
    private ArrayList<Mail> lista;

    /**
     * Constructor for objects of class MailList
     */
    public MailList(String e)
    {
        // initialise instance variables
        this.end = e;
        this.lista = new ArrayList<Mail>();
    }

    public void add(Mail m)
    {
        this.lista.add(m.clone());
    }
    public void add(String e, int a, int m, int d, String s, String t)
    {
        this.lista.add(new Mail(e,a,m,d,s,t));
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int tamanho()
    {
        return this.lista.size();
    }
    
    public int mailPorEndereco(String e)
    {
        int conta = 0;
        for(Mail m:this.lista)
            if(m.getEnd().equals(e)) conta++;
            
        return conta;
    }
    
    public ArrayList<Mail> listaPalavra(String pal)
    {
        ArrayList<Mail> temp = new ArrayList<Mail>();
        
        for(Mail m:this.lista)
            //if(m.getSubjet().indexOf(pal) != -1)
            if(m.existe(pal))
                temp.add(m.clone());
                
        return temp;
    }
    
    public void elimina_data(int ano, int mes, int dia)
    {
        GregorianCalendar data = new GregorianCalendar(ano,mes,dia);
        
        for(Mail m:this.lista)
            if(m.getDatar().getTimeInMillis() < data.getTimeInMillis())
                this.lista.remove(m);
    }
    public void elimina_data2(int ano, int mes, int dia)
    {
        GregorianCalendar data = new GregorianCalendar(ano,mes,dia);
        long data2 = data.getTimeInMillis();
        
        Iterator<Mail> i = this.lista.iterator();
        
        while(i.hasNext())
        {
            Mail m = i.next();
            if(m.getDatar().getTimeInMillis() < data2)
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
    
    public int mailAnexos()
    {
        int conta = 0;
        
        for(Mail m:this.lista)
            if(m.getClass().getName().equals("MailAtt"))
                conta++;
                
        return conta++;
    }
    
}
