import java.util.*;
public abstract class Veiculo
{
    private String matricula;
    private ArrayList<Contratavel> servico;
    private double custo;
    
    public Veiculo(String m,double c)
    {
        this.matricula = m;
        this.custo=c;
        this.servico=new ArrayList<Contratavel>();
    }
    
    public void add(Contratavel c)
    {
        this.servico.add(c);
    }
    public String getMatricula()
    {
        return this.matricula;
    }
    public double getCusto()
    {
        return this.custo;
    }
    
    public ArrayList<Contratavel> getServico()
    {
        ArrayList<Contratavel> temp=new ArrayList<Contratavel>();
        for(Contratavel i :this.servico)
        temp.add(i);
        return temp;
    }
    
    public abstract double custoPorContrato(Contratavel ct);
    
    public abstract Veiculo clone();
    
}
