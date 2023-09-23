
/**
 * Write a description of class t2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
public class t2
{
    public static void main(String nnn[])
    {
        GereEstufas g = new GereEstufas("BatataBatatinha");
        Fruta f = new Fruta(1,100,12,27);
        f.addFruta("laranjas");
        f.addFruta("peras");
        g.insere(f);
        Legumes l = new Legumes(2,104,10,23,"Abacate",123);
        g.insere(l);
        System.out.println("area total da empresa = "+g.area_total());
        
    }
}
