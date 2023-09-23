import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta>banco;
public Banco(){
this.banco = new ArrayList<Conta>();

}
    public void add (String ti, double sol,int a,int m,int d ){
   this.banco.add(new Conta(a,m,d,ti,sol));
    }
    
    public int num_contas()
    {
        return this.banco.size();
    }
    
     public  double Total(){
        double total=0;
        for(Conta c:this.banco)
        total += c.getSaldo();
        return total;
        }
}
