
class Deposit implements Runnable {

    private Bank b;

    private long I;
    private int  V;

    Deposit(Bank b,long I,int V)
    {
        this.b=b;
        this.I=I;
        this.V=V;
    }
    public void run() {
        final long I=100;

        for (long i = 0; i < I; i++)
            //System.out.println(i);
            b.deposit(V);
    }
}


public class Threadsbank {

    Bank b=new Bank();
    final int T=10;

    final int D=1000;

    final int V=100;


    Thread[] threads=new Thread[T];

    for(int i=0;i<T; i++)
    {
        threads[i]=new Thread(new Deposit(b,D,V));
    }

    for(int i=0;i<T;i++)
    {
        threads[i].start();
    }

    for(int i=0;i<T;i++)
    {
        try{
            threads [i].join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    System.out.println("Saldo final"+b.balance());

    }
}