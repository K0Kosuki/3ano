

public class Conta {
    public static int getConta(){
        return conta;
    }
    
    public static double saldo(){
        return sgeral;
    }
    private static int conta = 0;
    private static double sgeral = 0.0;
    private String Titular;
    private double list, saldo;
    private double move[];
    private int num;
    private int index; // onde guarda


 public Conta(String a,double si){

    this.Titular = a;
    this.num = ++Conta.conta;
    this.saldo =si;
    this.index=0;
    this.move = new int[Conta.TAMANHO];
    
 }
 public void credito(double v){
    this.move[(this.index++)] =~v;
    this.saldo +=v;
 } 


}