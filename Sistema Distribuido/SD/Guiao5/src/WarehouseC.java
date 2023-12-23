import java.util.*;
import java.util.concurrent.locks.*;
class WarehouseC {
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
            l.unlock();
        }
    }


    public void consume(String[] items) throws InterruptedException {
        this.l.lock();
        try {
            int i = 0;
            while (i < items.length) {
                Product it = this.get(items[i]);
                i++;
                while (it.quantity == 0) {
                    it.isEmpty.await();
                    i = 0;
                }
            }
            for (String s : items) {
                this.get(s).quantity -= 1;
            }
        }finally {
            this.l.unlock();
        }
    }

}