import java.util.*;
import java.util.concurrent.locks.*;

public class Wrehouse {

    private Lock l = new ReentrantLock();
    private Map<String, Product> map = new HashMap<String, Product>();

    private class Product {
        int quantity = 0;
        Condition isEmpty = l.newCondition();
    }

    private Product get(String item) {
        l.lock();
        try {
            Product p = map.get(item);
            if (p != null) {
                return p;
            }
            p = new Product();
            map.put(item, p);
            return p;
        } finally {
            l.unlock();
        }
    }

    void supply(String item, int quantity) {
        l.lock();
        try {
            Product p = get(item);
            p.quantity += quantity;
            p.isEmpty.signalAll();
        }finally { l.unlock(); }

    }
    
    void consume(String item, int quantity)throws InterruptedException {
        l.lock();
        try {
            Product p = get(item);
            if(p.quantity==0)
            {
                p.isEmpty.await();
            }
            p.quantity --;
        }finally { l.unlock(); }
    }
}
