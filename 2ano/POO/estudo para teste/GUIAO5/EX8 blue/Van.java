public class Van extends Veiculo implements Contratavel {
    private String nome;
    private double capacidade;
    private int peso;
    private double distancia;
    public Van(String m , double c,String n,double cap,int p,double dis){
        super(m,c);
        this.nome=n;
        this.capacidade=cap;
        this.peso=p;
        this.distancia = dis;
    }
    public String getNome(){
        return this.nome;
    }
    public double getCap(){
        return this.capacidade;
    }
    public int getPeso(){
        return this.peso;
    }
    
    public double custoPorContrato(Contratavel ct){
        return this.getCusto*ct.getDistancia*ct
    }
}