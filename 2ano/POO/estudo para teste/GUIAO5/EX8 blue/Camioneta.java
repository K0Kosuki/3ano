
public class Camioneta extends Veiculo implements Contratavel
{
    private double factor;
    private String motorista;
    private int peso;
    
    public Camioneta(String mat,double c ,String m,int p,double f){
        super(mat,c);
        this.motorista=m;
        this.peso=p;
        this.factor=f;
    }
    
    
    public double getFactor(){
    return this.factor;
    }
    public int getPeso(){
    return this.peso;
    }
    public String getMotor(){
    return this.motorista;
    }
    
   public double custoPorcontrato(Contratavel y){
       return this.getFactor()*this.getPeso()*this.getMotor();
   }
    
}
