import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Barrier {

    private ReentrantLock l;


    private int N;
    private int threadsBlocked;
    private Condition c;


    Barrier (int N) {
        this.N=N;
        this.threadsBlocked=0;
        this.l= new ReentrantLock();
        this.c = l.newCondition();
    }


    public void espera() throws InterruptedException{
        l.lock();
        try {
            this.threadsBlocked++;
            if(threadsBlocked<0){
            while (threadsBlocked<N){
                c.await();}
            }else{
                c.signalAll();
                this.threadsBlocked = 0;
            }
           // c.signal();
        }finally{
            l.unlock();
        }
    }



}
