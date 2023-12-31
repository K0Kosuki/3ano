import java.util.*;
import java.util.concurrent.locks.*;

public class Res {
  private Lock l = new ReentrantLock();
  private Map<String,Integer> map= new HashMap<String,Integer>();
  private int id = 0;
  private Condition sold = l.newCondition();
  private Condition empty = l.newCondition();
  

  int anunciar(String artigo, int valor){
    l.lock();
    try{
        map.put(artigo, valor);
        id++;
        empty.signal();
        return id;
    }finally{
        l.unlock();
    }
  }
  boolean oferecer(String artigo, int oferta) throws InterruptedException {
    l.lock();
    try{
            while(map.isEmpty())
            {
                empty.await();
            }

            int valor = map.get(artigo);
            
            if (valor < oferta) {
                map.remove(artigo);
                return true;
            }else
            return false;

            
       
        
    }finally{l.unlock();}
  }
}
