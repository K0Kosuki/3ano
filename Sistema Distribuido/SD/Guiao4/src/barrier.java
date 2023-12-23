import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class barrier {

        private int count;
        private ReentrantLock l;

        private int N;

        private int epoch=0;

        private Condition cond;

        private barrier(int N)
        {
            this.N=N;
            this.count=0;
            this.l=new ReentrantLock();
            this.cond= l.newCondition();

        }

        void await() throws InterruptedException {
            l.lock();



            try{

                int e=epoch;

                this.count++;

                if(count<N)
                {
                    while(epoch==e)
                    {
                        cond.await();
                    }
                }else{
                    cond.signalAll();
                    count=0;
                    epoch+=1;
                }
            }
            finally{
                l.unlock();
            }
        }

}
