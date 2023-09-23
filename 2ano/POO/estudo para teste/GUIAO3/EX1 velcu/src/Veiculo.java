public class Veiculo {
    private String matricula;
    private int Kms;
    private int capacidade;
    private int litros;
    private double media;
    private int viagens ;

    public static final int RESERVA = 10;

    public Veiculo() {
        this.matricula= "INM11-45-14";
        this.Kms=0;
        this.capacidade=RESERVA;
        this.litros=0;
        this.media =0.0;
        this.viagens=0;
    }

    public Veiculo(String m,int x, int cap, int l ,double med,int via){
        this.matricula= m;
        this.Kms=x;
        this.capacidade=cap;
        this.litros=l;
        this.media=med;
        this.viagens=via;
    }

    public String getMatricula()
    {return this.matricula;}
    
    public int getKms()
    {return this.Kms;}
    
    public int getCapacidade()
    {return this.capacidade;}
    
    public int getLitros()
    {return this.litros;}
    
    public double getMedia()
    {return this.media;}
    
    public int getViagens()
    {return this.viagens;}

    public double autonomia()
    { return this.litros * 100.0 / this.media; }
    
    private double gasto(int K)
    { return K * this.media / 100.0; }
    
    
    public boolean reserva()
    { return this.litros <= Veiculo.RESERVA;}

    public double valortotal(double custo)
    { return this.gasto(this.Kms) * custo; }
    


}
