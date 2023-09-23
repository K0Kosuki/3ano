
/**
 * Write a description of class t here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class t
{
    
    public static void main(String a[])
    {
        Veiculo v = new Veiculo("AA-22-22",12000,60,25,9,2);
        Veiculo v1 = new Veiculo("BB-11-11",1000,50,20,9,2);
        System.out.println("autonomia do veiculo "+v.getMatricula()+" é "+v.autonomia());
        v.viagem(120);
        System.out.println("autonomia do veiculo "+v.getMatricula()+" é "+v.autonomia());
        Veiculo v2 = new Veiculo("GG-11-22",17000,65,20,8.5,22);
        System.out.println("autonomia do veiculo "+v2.getMatricula()+" é "+v2.autonomia());
        System.out.println("custo medio das viagens efetuadas = "+v.custoKms(1.45));
        v2.atestar(34);
        System.out.println("autonomia do veiculo "+v2.getMatricula()+" é "+v2.autonomia());
        Stand s = new Stand("JoaoHonesto",32);
        s.adicionar("AA-22-22",12000,60,25,9,2);
        s.adicionar("BB-11-11",1000,50,20,9,2);
        System.out.println(s.toString());
        boolean t = s.vender("AA-22-22");
        System.out.println(s.toString());
    }
}
