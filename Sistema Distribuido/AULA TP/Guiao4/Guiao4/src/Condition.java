public interface Condition {
    void await();
    void signal();
    void signalAll();
}

