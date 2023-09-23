
/**
 * Write a description of class Teste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teste
{
    public static void main(String a[])
    {
        
        Parafuso p1 = new Parafuso(1,0.25);
        Parafuso p2 = new Parafuso(2,0.10);
        Costura c = new Costura(1,0,155);
        c.add(p1);
        c.add(p2);
        c.gastaHoras(155);
        c.add(new Parafuso(3,0.17));
        c.add(new Parafuso(4,190));
        Corte ct = new Corte(2,12);
        ct.add(p1);
        ct.add(new Parafuso(5,54.39));
        c.add(ct);
        
        System.out.println("valor Corte = "+ct.valor()+ " codigo= "+ct.getCodigo());
        System.out.println("valor Costura = "+c.valor()+" codigo= "+c.getCodigo());
        
        Empresa e = new Empresa();
        e.add(c);
        e.add(ct);
        System.out.println("Maquina com mais valor = "+e.maisValor());
        
        
        
    }
}
