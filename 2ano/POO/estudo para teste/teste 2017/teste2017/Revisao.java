
public class Revisao extends  Servico
{
    
    private int dura;
    private static double valor =1.5;
    
    public Revisao(int c,int cl,int d)
    {
            super(c,cl);
           this.dura=d;
    }
    public int getDura()
    {
        return this.dura;
    }
    
    public double custo()
    {
        return this.dura*super.tam_presta()*Revisao.valor;
    }
    public Revisao clone()
    {
        Revisao temp = new Revisao(super.getCodigo(),super.getCli(),this.dura);
        for (Integer i:super.getListaPrest())
        temp.add(i);
        return temp;
    }
}
