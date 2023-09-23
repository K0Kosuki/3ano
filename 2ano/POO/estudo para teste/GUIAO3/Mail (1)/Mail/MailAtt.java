
/**
 * Write a description of class MailAtt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MailAtt extends Mail
{
    // instance variables - replace the example below with your own
    private int attach;

    /**
     * Constructor for objects of class MailAtt
     */
    
    
    
    public MailAtt(String e, int ano, int mes, int dia, String ass, String texto, int bytes)
    {
        // initialise instance variables
        super(e,ano,mes,dia,ass,texto);
        this.attach = bytes;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getAttach()
    {
        // put your code here
        return this.attach;
    }
    
    public MailAtt clone()
    {
        GregorianCalendar tt = super.getDatae();
        int ano = tt.get(Calendar.YEAR); 
        int mes = tt.get(Calendar.MONTH);
        int dia = tt.get(Calendar.DAY_OF_MONTH);
        return new MailAtt(super.getEnd(),ano,mes,dia,super.getSubjet(),super.getTexto(),this.attach);
    }
    
}
