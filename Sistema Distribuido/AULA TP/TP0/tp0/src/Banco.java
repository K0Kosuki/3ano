// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public interface Banco {
    int open();
    int balance(int id);
    boolean deposit(int id, int value);
    boolean withdraw (int id, int value);

    String name(int id);
    String cc(int id);


}