import java.util.*;
import java.util.concurrent.locks.*;

public class Res {
    private Lock l = new ReentrantLock();
    private Condition empty = l.newCondition();
    private Condition n_empty = l.newCondition();
    private String currf = null;

    public void assite(String filme) throws InterruptedException  {
        l.lock();
        try {
            while(currf != null) {
                empty.await();
        } 
        currf = filme;
        n_empty.signal();
    }
        finally {

            l.unlock();
        }
    }

    public void abandona(String filme) throws InterruptedException {
        l.lock();
        try {
            while (currf == null) {
                n_empty.await();
            }
            currf =null;

            empty.signal();
            
        } finally {
            l.unlock();
        }
    }
    public String filmeEmExibicao()
    {
        l.lock();
        try {
       
        if (currf  != null) {
            return currf;
        }
        return "nenhum";
    }finally
    {
        l.unlock();
    }
    }
}
