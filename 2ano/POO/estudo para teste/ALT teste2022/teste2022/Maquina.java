import java.util.*;
public abstract class Maquina
{    
    private int cod;
    private ArrayList<Tarefa> jobs;
	
    Maquina(int n)
    { this.cod = n; 
        this.jobs = new ArrayList<Tarefa>();}
 
    public int getCod()
    { return this.cod;}

    public List<Tarefa> getListTasks()
    {   
     ArrayList<Tarefa> temp = new ArrayList<Tarefa>();
     for(Tarefa c: this.jobs)
             temp.add(c);
      return temp;
    }

    public void add(Tarefa c)
    { this.jobs.add(c); } 

    public int numTasks()
    { return this.jobs.size();}

    public abstract double consumo(double preco); // parâmetro é preço por hora
    public abstract Maquina clone();
           
}

