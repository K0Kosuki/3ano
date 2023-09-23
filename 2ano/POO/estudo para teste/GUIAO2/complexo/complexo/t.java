
/**
 * Write a description of class t here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class t
{
    public static void main()
    {
        Complexo a = new Complexo(1,2);
        Complexo b = new Complexo(-1,-1);
        Complexo c = a.soma(b);
        Complexo d = a.multi(c);
        
        System.out.println("a ="+a.getReal()+"+"+a.getImag()+"i");
        System.out.println("b ="+b.getReal()+"+"+b.getImag()+"i");
        System.out.println("a+b ="+c.getReal()+"+"+c.getImag()+"i");
        System.out.println("a*b ="+d.getReal()+"+"+d.getImag()+"i");
        
        System.out.println(c.polar());
    }
}
