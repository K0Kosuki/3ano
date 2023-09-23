
public class M2 extends Maquina
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double preco;
    
    public M2(int c,double preco)
    {
        super(c);
        this.preco=preco;
    }
    public double getPreco()
    {
        return this.preco;
    }
    
    public double consumo(double preco)
    {
      return preco * super.numTasks();
    }
    public M2 clone()
    {
        M2 temp = new M2(super.getCod(),this.preco);
        for(Tarefa t:super.getListTasks())
        temp.add(t);
        return temp;
    }
}
