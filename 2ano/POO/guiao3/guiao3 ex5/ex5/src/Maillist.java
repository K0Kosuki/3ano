import java.util.*;
public class Maillist 
{
    private  String end;
    private ArrayList<Mail> lista;

public Maillist(String e)
{
    this.end = e;
    this.lista = new ArrayList<Mail>();
}
    
public int tamanho() {
    return this.lista.size()
}

public void add() {
    this.lista.add(n.clone());
}
    
}