import javax.print.attribute.standard.PrinterName;

public class test {
    public static void main(String[] args){

        Complexo a = new Complexo(1,2);
        Complexo b = new Complexo(-1,-1);
        Complexo c = a.soma(b);

        System.out.println("a ="+a.getReal()+"+"+a.getImag()+"i");
        System.out.println("b="+b.getReal()+"+"+b.getImag()+"i");
        System.out.println("a+b ="+c.getReal()+"+"+c.getImag()+"i");
    }   
}