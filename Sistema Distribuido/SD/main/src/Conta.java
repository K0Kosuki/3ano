public class Conta {

    private String name;
    private String cc;

    private int balance;


    Conta(String nome,String CC)
    {
        this.name=nome;
        this.cc=CC;
        this.balance=0;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
