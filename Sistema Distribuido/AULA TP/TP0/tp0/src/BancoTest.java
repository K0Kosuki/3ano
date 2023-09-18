public class BancoTest {
    public static  void main(String[] args){
        Banco b= new BancoImpl();

        int conta0 = b.open();
        int conta1= b.open();
        b.deposit(0,10);
        System.out.println("Conta0: "+b.balance(conta0) + "\nConta1: "+b.balance(conta1));

    }
}
