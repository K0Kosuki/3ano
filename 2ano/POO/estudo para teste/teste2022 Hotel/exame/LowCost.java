

public class LowCost extends Hotel
{
  private boolean promocao;
  
    public LowCost(String n,String l,double p,int num,boolean pro)
  {
     super(n,l,p,num);
     this.promocao = pro;
  }
  public boolean getPro()
  {
      return this.promocao;
  }
  public void setPro(boolean p)
  {
      this.promocao = p;
  }
  
  public double dormida(int mes)
  {
      double v=0;
      if(this.promocao && 10>= mes && 3<=10)
      {
          v= super.getPreco()-super.getPreco()*0.25;
      }
      if(this.promocao)
      {
          v = super.getPreco()-super.getPreco()*0.15;
      }
      else
      {
          v=super.getPreco();
      }
      return v;
  }
  
  public LowCost clone()
  {
     
     LowCost temp = new LowCost(super.getNome(),super.getLocal(),super.getPreco(),super.getNum(),this.promocao);
      for(Integer i : super.getOcupa())
      temp.add(i);
      return temp;
  }
}
