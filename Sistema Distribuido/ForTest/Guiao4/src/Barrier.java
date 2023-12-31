import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Barrier {
    private  ReentrantLock l;
    private int count;
    private Condition condi;
    private Condition
    private int epoch=0;

    private barrier(int N){
        this.N = N;
        this.count = 0;
        this.l = new ReentrantLock();

    }


    void await() throws InterruptedException { 
        l.lock();


     }


}
