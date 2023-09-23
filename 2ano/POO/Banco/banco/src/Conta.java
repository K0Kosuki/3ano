public class Conta {

    private static final int TAMANHO = 100;
    private static int conta = 0;
    private static double sgeral = 0.0;

    private String titular;
    private double saldo;
    private int num;
    private double movs[];
    private int index;

    public static int getConta() {
        return Conta.conta;
    }

    public static double saldo() {
        return Conta.sgeral;
    }

}