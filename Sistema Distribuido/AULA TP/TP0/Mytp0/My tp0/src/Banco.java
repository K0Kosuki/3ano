public interface Banco {
    int open(String name, int cc);
    int balance(int id);
    boolean deposit(int id, int value);
    boolean withdraw (int id, int value);
    String name(int id);
    String cc(int id);

}
