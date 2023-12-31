
import java.util.concurrent.locks.*;
import java.util.*;

public class Res implements CarrinhaGelado {
    private Lock l = new ReentrantLock();
    private Map<String, Integer> topmap = new HashMap<String, Integer>();

    private List<String> order = new ArrayList<String>();
    private Condition empty = l.newCondition();
    private Condition n_empty = l.newCondition();
    private boolean status = false;

    public void pede(String sabor) throws InterruptedException {
        l.lock();
        try {
            order.add(sabor);
            n_empty.signal();
            while (status == false ) {
                
                empty.await();
            }

            int g = topmap.getOrDefault(sabor, 0);
            topmap.put(sabor, g + 1);
            

        } finally {
            status = false;
            l.unlock();
        }
    }

    public String pedidoSeguinte() throws InterruptedException {
        l.lock();
        try {
            while (order.isEmpty()) {
                n_empty.await();
            }
            String or = order.get(0);
            order.remove(0);
            status = true;
            empty.signal();
            return or;

        } finally {
            l.unlock();
        }

    }

    public Map<String, Integer> topSabores() {
        List<Map.Entry<String, Integer>> geladotop = new ArrayList<>(topmap.entrySet());
        geladotop.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        Map<String, Integer> sortedFlavorSales = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : geladotop) {
            sortedFlavorSales.put(entry.getKey(), entry.getValue());
        }
        return sortedFlavorSales;
    }
    
}