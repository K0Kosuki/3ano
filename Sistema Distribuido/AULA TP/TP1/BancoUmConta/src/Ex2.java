import java.util.concurrent.locks.ReentrantLock;

class Deposit implements Runnable {

    private Bank b;
    private long I;
    private int V;
    Deposit(Bank b,long I,int V){
        this.b = b;
        this.I = I;
        this.V = V;
    }
    public void run() {
        final long I = 1000;
        for(long i=0; i<I ;i++)
        {
            b.deposit(this.V);
            System.out.println( "value: "+b.balance());
        }
    }
}


class Bank {
    private ReentrantLock l = new ReentrantLock();
    private static class Account {

        private int balance;
        Account(int balance) { this.balance = balance; }
        int balance() { return balance; }
        boolean deposit(int value) {
            balance += value;
            return true;
        }
    }

    // Our single account, for now
    private Account savings = new Account(0);

    // Account balance
    public int balance() {

        this.l.lock();
        try{
            return savings.balance();
        }finally {
            this.l.unlock();
        }

    }

    // Deposit
    boolean deposit(int value) {
        return savings.deposit(value);
    }
}

public class Ex2 {
    public static void main(String[] args){
        final int N = 10;
        final int I = 1000;
        final int V = 100;
        Thread [] threads = new Thread[N];
        Bank conta = new Bank();

        for(int i=0;i<N;i++){
            threads[i] = new Thread(new Deposit(conta,I,V));
        }

        for (int i=0;i<N;i++)
        {
            threads[i].start();


        }

        for(int i = 0;i<N;i++){
            try {
                threads[i].join();

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("balance : "+conta.balance());
    }
}