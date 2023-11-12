import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

class Warehouse {
    private Map<String, Product> map =  new HashMap<String, Product>();
    private Lock l =new ReentrantLock();
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
        l.lock();
        try {
            Product p = get(item);
            p.quantity += quantity;
            p.isEmpty.signalAll();
        }finally {
           this.l.unlock();
        }
        }


    public void consume(Set<String> items)throws InterruptedException {
        l.lock();
        try
        {

            for (String s : items)
            {
                Product p = map.get(s);
                while (p.quantity == 0){
                    p.isEmpty.await();
                }
                p.quantity -= 1;
        }
        }finally{l.unlock();
}





    /*
  public void consume(Set<String> items)throws InterruptedException {
      l.lock();
      try
      {
        int i = 0;
          for (String s : items)
          {
              Product p = map.get(s);
              i++;
              while (p.quantity == 0){
                  p.isEmpty.await();
                  i=0;
              }
              for(String s : items) {
                  p.quantity -= 1;
              }
          }
      }finally{l.unlock();
      }


*/


public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("i1",4);
        map.put("i2",0);
        supply s2 =new Supply();

    }
}