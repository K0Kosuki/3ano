
import java.util.concurrent.locks.*;
import java.util.*;

public class Res implements HPC {
    private final Lock lock = new ReentrantLock();
    private final Condition coresAvailable = lock.newCondition();
    private int totalCores; // 应初始化为系统总核心数
    private int nextId = 0;
    private Map<Integer, Long> taskHistory = new HashMap<>();

    public Res(int totalCores) {
        
        this.totalCores = totalCores;
    }

    @Override
    public int inicio(int ncores) throws InterruptedException {
        lock.lock();
        try {
            while (this.totalCores < ncores) {
                coresAvailable.await();
            }
            this.totalCores -= ncores;
            return nextId++;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void fim(int tarefa, long tempo) {
        lock.lock();
        try {
            taskHistory.put(tarefa, tempo);
            // 假设每个任务只用了一个核心，如果不是这样，这里的逻辑需要调整
            this.totalCores++;
            coresAvailable.signalAll(); // 通知等待的任务现在可能有足够的核心可用
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Map<Integer, Long> historia() {
        return new HashMap<>(taskHistory);
    }
}
