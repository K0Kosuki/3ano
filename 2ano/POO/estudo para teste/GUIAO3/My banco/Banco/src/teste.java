public class teste {
    public static void main(String[] args) {
        Conta c0 = new Conta(2012,5,7,"joao",88741);
        Conta c1 = new Conta(2042,6,14,"marco",74235);
        Conta NumConta = getNum();
        Banco b0= new Banco()  ;
        System.out.println("c0="+c0.getNum());
        System.out.println("c1="+c1.getNum());
        System.out.println("Numero de conta: "+Conta.getNum());
    
    }
}
