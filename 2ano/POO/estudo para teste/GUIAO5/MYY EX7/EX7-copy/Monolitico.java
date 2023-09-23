
public class Monolitico extends Circuito
{
 public Monolitico(int c)
 {
     super(c);
 }
 
 public double valor()
 {
     double total=0;
     for(Integer i : super.getComponentes())
     total= Tabela.precos(i)*super.get(i);
     return total;
}

public Monolitico clone()
{
    Monolitico m = new Monolitico(super.getCodigo());
    for(Integer i :super.getComponentes())
    m.add(i,super.get(i));
    return m;
}
}
