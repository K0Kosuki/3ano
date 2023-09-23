import java.util.*;
import java.util.ArrayList;

public class Conta 
{
    private String titular;
    private double saldo;
    private int num;
    private double movs[];
    private int index;
    private ArrayList<Mov> list;
  
public Conta(String t, double sal, int n)
{
    this.titular = t;
    this.saldo = sal;
    this.num = Conta.n+;
    this.list = new ArrayList<Mov>();
}

public String getTitular()
{
    return this.titular;
}
public double getSaldo()
{
    return this.saldo;
}

public int getNum()
{
    return this.num;
}

public void debito(int ano,int mes,int dia,String de,double val){
    this.saldo -= val;
    this.list.add(ano,mes,dia,de,val);
}
public boolean equals(Conta c)
{
    if(c != null)
    return (this.num == c.getNum() && this.titular.equals(c.getTitular()));
    else
    return(false);
}

public Object clone()
{
    Conta temp = new Conta(this.titular,this.list,get(0).getValor());
    for(Mov mes:this.list)
    {
        
    }
}





}
