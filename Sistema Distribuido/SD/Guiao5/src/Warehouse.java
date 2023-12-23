import java.util.*;
import java.util.concurrent.locks.*;
class Warehouse {
    private Lock l = new ReentrantLock();
    private Map<String, Product> map =  new HashMap<String, Product>();

    private class Product {
        int quantity = 0;
        Condition isEmpty = l.newCondition();
    }

    private Product get(String item) {
        Product p = map.get(item);
        if (p != null) return p;
        p = new Product();
        map.put(item, p);
        return p;
    }

    public void supply(String item, int quantity) {
        this.l.lock();
        try {
            Product p = get(item);
            p.quantity += quantity;
            p.isEmpty.signalAll();
        }finally {
            this.l.unlock();
        }
    }


    public void consume(Set<String> items) throws InterruptedException {
        this.l.lock();
        try {
            for (String s : items) {
                Product it = get(s);
                while (it.quantity == 0) {
                    it.isEmpty.await();
                }
                it.quantity--;
            }
        }finally {
            this.l.unlock();
        }
    }

}

