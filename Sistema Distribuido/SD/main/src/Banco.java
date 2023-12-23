public interface Banco {
    //int open();

    int open(String nome, String cc);

    int balance(int id);
    boolean deposit(int id, int value);
    boolean withdraw (int id, int value);

}
