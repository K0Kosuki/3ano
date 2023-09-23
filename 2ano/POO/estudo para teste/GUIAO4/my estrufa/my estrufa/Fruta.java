import java.util.ArrayList;
import java.util.*;
public class Fruta extends Estufa
{

private static int valorF=100;
private ArrayList<String> nome;

public static int getValorF() { 
    return valorF;
}

public ArrayList<String> getNome() {
return this.nome = new ArrayList<String>();
}

public Fruta(int area,int codigo,int maxi,int mini)
{
super(area,codigo,maxi,mini);
this.nome= new ArrayList<String>();
}

public void add(String n){
    this.nome.add(n);
}

public double Total()
{
return Fruta.getValorF()*super.getArea();
}


public Fruta clone()
{
   Fruta t= new Fruta(super.getArea(),super.getCodigo(),super.getMax(),super.getMin());
    for(String n : this.nome)
    t.add(n);
    return t;
}


}


