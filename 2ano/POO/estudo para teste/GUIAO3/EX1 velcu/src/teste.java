public class teste {
    public static void main(String[] args) {
       
        Veiculo v = new Veiculo("ui-79-542",12000,60,25,44,2);
        System.out.println("autonomia: " +v.autonomia());
        System.out.println("nao reserva?: "+v.reserva());

    }
}
