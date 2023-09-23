
/**
 * Write a description of class Veiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Veiculo
{
    // instance variables - replace the example below with your own
    private String matricula;
    private int kms;          // conta-kilometros
    private int capacidade;  // deposito
    private int litros;      // litros no deposito
    private double media;    // media aos 100 kms do carro
    private int viagens;     // nº de viagens
    
    public static final int RESERVA = 10;

    /**
     * Constructor for objects of class Veiculo
     */
    public Veiculo()
    {
       this.matricula = "00-AA-00";
       this.kms = 0;
       this.capacidade = RESERVA;
       this.litros = 0;
       this.media = 5.0;
       this.viagens = 0;
    }

    public Veiculo(String m, int x, int cap, int l, double med, int v)
    {
       this.matricula = m;
       this.kms = x;
       this.capacidade = cap;
       this.litros = l;
       this.media = med;
       this.viagens = v;
    }
    
    public Veiculo(Veiculo m)
    {
       this.matricula = m.getMatricula();
       this.kms = m.getKms();
       this.capacidade = m.getCapacidade();
       this.litros = m.getLitros();
       this.media = m.getMedia();
       this.viagens = m.getViagens();
    }
    
    /**
      
     */
    public String getMatricula()
    {return this.matricula;}
    
    public int getKms()
    {return this.kms;}
    
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
    
    public boolean viagem(int K)
    { 
      if(this.autonomia() > K)
      {
          this.viagens++;
          this.kms += K;
          this.litros -=  this.gasto(K);
          return true;
      }
      else
          return false;
    }
    
    public boolean reserva()
    { return this.litros <= Veiculo.RESERVA;}
    
    public double valortotal(double custo)
    { return this.gasto(this.kms) * custo; }
    
    public double custoKms(double custo)
    { return this.valortotal(custo) / this.kms; }
    
    //public void atestar(int L)
    //{ this.litros = (this.litros + L > this.capacidade ? this.capacidade : this.litros + L);}
    
    public int atestar(int L) 
    { 
      if(this.litros + L > this.capacidade)
      {
        this.litros = this.capacidade;
        return this.capacidade - this.litros + L;
      }
      else
      {
          this.litros += L;
          return 0;
      }
    }
    
    public Veiculo clone()
    { return new Veiculo(this);}
    
    
    public boolean equals(Veiculo o)
    {
        if(o != null)
             return this.matricula.equals(o.getMatricula()); // carros iguais => mat igual!       
        else
             return false;
    }
    
    /*
     * 
     public String toString()
    {
        StringBuffer sb = new StringBuffer();
        
        sb.append("Mat: ");
        sb.append(this.matricula+"\n");
        sb.append("Kms: ");
        sb.append(this.kms+"\n");
        sb.append("Capa: ");
        sb.append(this.capacidade+"\n");
        sb.append("Litros: ");
        sb.append(this.litros+"\n");
        sb.append("Media: ");
        sb.append(this.media+"\n");
        sb.append("Viagens: ");
        sb.append(this.viagens+"\n");
        
        return sb.toString();
    }
    */
   public String toString()
   {
       return "Mat: "+this.matricula+"Kms: "+this.kms+"Capa: "+this.capacidade+"Litros: "+this.litros+"Media: "+this.media+"Viagens: "+this.viagens+"\n";
    }
}
