import java.util.*;
public class Mail{
private String endreco;
private GregorianCalendar datae;
private GregorianCalendar datar;
private String texto;
private String assunto;

public String getEndreco(){
    return this.endreco;
}
public String getTexto(){
    return this.texto;
}
public String getAssunto(){
    return this.assunto;
}
public GregorianCalendar getDatae(){
    return (GregorianCalendar)this.datae.clone();
}
public GregorianCalendar getDatar()
    { return (GregorianCalendar)this.datar.clone();}

public Mail(String end,int a,int m,int d,String tex,String ass){
    this.endreco=end;
    this.assunto=ass;
    this.texto=tex;
    this.datae = new GregorianCalendar(a,m,d);
    this.datar= new GregorianCalendar();
}
public boolean existe(String a){
    return  this.texto.indexOf(a)!=-1;
}




}