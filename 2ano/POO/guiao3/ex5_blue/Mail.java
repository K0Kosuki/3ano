import java.util.GregorianCalendar;

public class Mail {
    private GregorianCalendar datae;
    private GregorianCalendar datar;
    private String endereco;
    private String texto;
    private String assunto;
    

    public Mail(String e, int ano, int mes, int dia, String as, String tex) 
    {
        this.endereco = e;
        this.datar = new GregorianCalendar(ano, mes, dia);
        this.datae = new GregorianCalendar();
        this.texto = tex;
        this.assunto = as;
    }

    public Mail(String e, GregorianCalendar de, GregorianCalendar dr, String as, String tex) 
    {
        this.endereco = e;
        this.datar = (GregorianCalendar) dr.clone();
        this.datae = (GregorianCalendar) de.clone();
        this.texto = tex;
        this.assunto = as;
    }

    public String getendereco() 
    {
        return this.endereco;
    }

    public String getassunto()
    {
        return this.assunto;
    }

    public GregorianCalendar getDataE() 
    {
        return (GregorianCalendar) this.datae.clone();
    }

    public GregorianCalendar getDataR() 
    {
        return (GregorianCalendar) this.datar.clone();
    }

    public boolean existe(String as) 
    {
        return this.assunto.indexOf(as) != -1;
    }

    public Mail clone()
    {
        return new Mail(this.endereco, this.datae, this.datar, this.assunto, this.texto);
    }
}
