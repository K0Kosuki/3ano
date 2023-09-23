import java.util.*;
import java.util.stream.*;
import java.io.*;
/**
 * Write a description of class GereEstufas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GereEstufas
{
    // instance variables - replace the example below with your own
    private String nome;
    private ArrayList<Estufa> lista;

    /**
     * Constructor for objects of class GereEstufas
     */
    public GereEstufas(String n)
    {
        // initialise instance variables
        this.nome = n;
        this.lista = new ArrayList<Estufa>();
    }

    /**
     * métodos para responder aos requisitos do problema
     */
    public void insere(Estufa e)
    {
        if(e != null)
            this.lista.add(e.clone());
    }
    
    public double valor()
    {
        double tot = 0.0;
        for(Estufa e: this.lista)
            tot += e.valorTotal();
            
        return tot;
    }
    
    public int area_total()
    {
        int sum = 0;
        //for(Iterator<Estufa> i = this.lista.iterator(); i.hasNext();)
          //  sum += i.next().getArea();
        for(Estufa e: this.lista)
            sum += e.getArea();
            
        return sum;
    }
    
    // versão iterador interno
    public int area_total2()
    {
        return this.lista.stream().mapToInt(Estufa :: getArea).sum();
    }
    
    public List<Integer> emRisco(int temp)
    {
        ArrayList<Integer> t = new ArrayList<Integer>();
        
        for(Estufa x: this.lista)
        {
            if(x.risco(temp))
                t.add(x.getCodigo());
        }
        return t; 
    }
    // versão lambda
    public List<Integer> emRisco2(int temp)
    {
        return this.lista.stream().filter(e -> e.risco(temp)).map(Estufa :: getCodigo).collect(Collectors.toList());   
    }
    // perdas mas só para as estufas especificadas pelo nome
    public double perdas(int temp, String nome)
    {
        double acc = 0.0;
        //for(Iterator<Estufa> i = this.lista.iterator(); i.hasNext();)
        for(Estufa x: this.lista)
        {
            //Estufa x = i.next();
            if(x.risco(temp) && nome.equals(x.getClass().getName())) // x instanceof nome
                acc += x.valorTotal();
        }
        
        return(acc);
        
    }
    // em composição funcional!
    public double perdas2(int temp, String nome)
    {
        return this.lista.stream().filter(e -> e.risco(temp) && nome.equals(e.getClass().getName())).mapToDouble(Estufa :: valorTotal).sum();
    }
    
    public int videiras()
    {
        int acc = 0;
        //for(Iterator<Estufa> i = this.lista.iterator(); i.hasNext();)
        for(Estufa x:this.lista)
        {
            //Estufa x = i.next();
            if(x instanceof Vinha)
                acc += ((Vinha)x).getPes();
        }
        
        return(acc);
        
    }
    
    public int totalCardinal()
    {
        int soma = 0;
        for(Estufa e: this.lista)
            if(e instanceof Cardinal)
            {
                Cardinal c = (Cardinal)e;
                soma += c.cardinalidade();
            }   
        return soma;
    }
        
}
