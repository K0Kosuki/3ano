import java.util.ArrayList;

import javax.print.DocFlavor.READER;

import java.util.*;
public class Conta {
private static int nc = 1;    
private String titular;
private int numero;
private double saldo ;
private ArrayList<Mov> movs;

public String getTitular()
    {
        return this.titular;
    }
    
    public double getSaldo()
    { return this.saldo; }
    
    public int getNum()
    { return this.numero; }


/*public Conta(String titu,double sal){
this.titular = titu;
this.saldo=sal;
this.movs = new ArrayList<Mov>();
GregorianCalendar now = new GregorianCalendar();
        int a = now.get(GregorianCalendar.YEAR);
        int m = now.get(GregorianCalendar.MONTH);
        int d = now.get(GregorianCalendar.DAY_OF_MONTH);
this.movs.add(new Mov(a, m, d, "saldo inicial", sal));
}*/
public Conta(int a ,int m,int d,String titu,double sal ){
    this.titular = titu;
    this.saldo=sal;
    this.numero = Conta.nc++;
    this.movs = new ArrayList<Mov>();
    this.movs.add(new Mov(a,m,d,"saldo incial",sal));
}

public boolean debito(int a,int m,int d,String des,double valor){
    if(this.saldo-valor>=0){
        this.saldo=this.saldo-valor;
        this.movs.add(new Mov(a, m, d, des, -1*valor));
        return true;
    }else{
        return false;
    }
    
}
public void credito(int a,int m,int d,String des,double valor){
this.saldo+=valor;
this.movs.add(new Mov(a,m,d,des,valor));
}
public String lista_movs(){
    String temp="";
    for(Mov m:this.movs)
    temp += m.getData()+" "+m.getDes()+"\n";
    return (temp);
}

public Object clone()
{
    Mov tmp = this.movs.get(0);
    Conta temp = new Conta(tmp.getAno(),tmp.getMes(),tmp.getDia(),this.titular,tmp.getValor());
    for(Mov m:this.movs)
    {
        if(m.getValor() > 0.0)
            temp.credito(m.getAno(),m.getMes(),m.getDia(),m.getDes(),m.getValor());
        else
            temp.debito(m.getAno(),m.getMes(),m.getDia(),m.getDes(),-1 * m.getValor());
    }
    return(temp);
}
}




