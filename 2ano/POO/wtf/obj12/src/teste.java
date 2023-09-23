
public class teste
{
    public static void main(String a[])
    {
        Ponto p1 = new Ponto(3,4);
        Ponto p2 = new Ponto(0,0);
        Ponto p3 = new Ponto(5,0);
        System.out.println(p1.toString());
        Triangulo t = new Triangulo(0,0,0,10,15,0);
        System.out.println(t.getP1X());
        System.out.println("lado1="+t.lado1());
        System.out.println("perimetro="+t.perimetro());
        System.out.println("area="+t.area());
        Triangulo t2 = new Triangulo(p1,p2,p3);
        System.out.println("area="+t2.area());
        p3.setX(7);
        System.out.println("area="+t2.area());
    }
}
