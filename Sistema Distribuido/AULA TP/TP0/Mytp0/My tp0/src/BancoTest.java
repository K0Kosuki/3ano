// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BancoTest {
    public static void main(String[] args) {
        Banco b= new BancoImpl();

        int conta0 = b.open("joao","kdjdsdj");
        int conta1= b.open("lu","jkfdsjkh");
        b.deposit(0,99990);
        b.deposit(1,543543);
        b.name(0);
        b.name(1);
        System.out.println("Conta0: "+b.balance(conta0) + "\nConta1: "+b.balance(conta1));
        System.out.println("Conta0 name: "+b.name(0));

        System.out.println("Total: "+b.totalBalance());
        }
    }
