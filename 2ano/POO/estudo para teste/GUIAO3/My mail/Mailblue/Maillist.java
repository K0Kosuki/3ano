import java.util.*;



public class Maillist {

    private ArrayList<Mail> lista;
    private String ende;

    public Maillist(String e) {
        this.lista = new ArrayList<Mail>();
        this.ende = e;
    }

    public int Total() {
        return this.lista.size();
    }

    public void add(String e, int a, int m, int d, String tex, String ass) {
        this.lista.add(new Mail(e, a, m, d, tex, ass));
    }

public int ende(String e){
int c =0;
for(Mail mail : this.lista){
if(mail.getEndreco()==e)
c++;

}
return c;

}

public ArrayList<Mail> listaPalavra(String palavra,String end,int a,int m,int d,String tex,String ass){
    ArrayList<Mail> temp = new ArrayList<Mail>();
    for(Mail mail: this.lista)
    if(mail.existe(palavra))
    temp.add(new Mail(end,a,m,d, tex,ass));
    return temp;
}

public void elimina(int a,int m,int d){
    for(Mail mail : this.lista)
    if(m.getdatar())
}


}