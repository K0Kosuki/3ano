public class bancoteste {

    public static void main(String[] args){
       Banco b=new BancoImpl();

       int conta0=b.open("t1","cc1");
       int conta1=b.open("t2","cc2");
       int value;

       System.out.println("Conta 0: "+b.balance(conta0)+"\nConta1: "+b.balance(conta1));

       b.deposit(conta1,value= 10);
       b.withdraw(conta0,value=5);

       System.out.println("Conta0: "+b.balance(conta0)+"\nConta1: "+b.balance(conta1));

        System.out.println("Saldo total: "+b.totalBalance());
    }
}
