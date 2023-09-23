public class Camioneta extends Veiculo implements Contratavel
{
    private double factor;
    private String motorista;
    private int peso;
    private double dis;
    
    public Camioneta(String mat,double c ,String m,int p,double f){
        super(mat,c);
        this.motorista=m;
        this.peso=p;
        this.factor=f;
    }
    
    
    public double getFactor(){
    return this.factor;
    }
    public double getPeso(){
    return this.peso;
    }
    public String getMotor(){
    return this.motorista;
    }
    public double getDistancia()
    {
        return this.dis;
    }
    
   public double custoPorContrato(Contratavel y){
       return this.getFactor()*super.getCusto()*y.getDistancia();
   }
   public Camioneta clone()
   {
       return new Camioneta(this.getMatricula(),this.getCusto(),this.motorista,this.peso,this.factor);
   }
    
}