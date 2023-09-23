import java.util.*;
import java.util.ArrayList;
public class Banco 
{
    private ArrayList<Conta> banco;

public Banco()
{
    this.banco = new ArrayList<Conta>();
}
public

private Conta find(int conta) 
{
Iterator<Conta> i =
}



public boolean debito(int nc,int ano,int mes,int dia,String desc,double val)
{
    Conta c
}



public int num_contas()
{
    return this.banco.size();

}
public double saldo()
{
    double total = 0.0;
    for(Conta c : this.banco)
    total += c.getSaldo();
    return total;
}


public void despessa(int ano,int mes,int dia,String desc,double val)
{
    for(Conta c ; this.banco)
    c.debido(ano,mes,dia,desc,val);
}
}


