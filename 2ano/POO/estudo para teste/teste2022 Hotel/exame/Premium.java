import java.util.*;
public class Premium extends Hotel
{
    private int estrela;
    
    public Premium(String n,String l,double p,int num,int e)
  {
     super(n,l,p,num);
     this.estrela = e;
  }
  public int getEstrela()
  {
      return this.estrela;
  }
  public void setEstrela(int x)
  {
      this.estrela =x;
  }
  
  public double dormida(int mes)
  {
      double v= 0;
      if(6<=mes && mes <=9 && this.getEstrela()<5)
      {
          v = super.getPreco()*0.3+super.getPreco();
      }
      if(this.getEstrela()==5 && 6<=mes && mes <=9)
      {
          v = super.getPreco()*0.3+super.getPreco()+0.1*super.getPreco();
      }
      if(this.getEstrela()==5)
      {
          v= 0.1*super.getPreco()+super.getPreco();
      }
      else
      {
          v = super.getPreco();
      }
      return v;
  }
  
  public Premium clone()
  {
     
      Premium temp = new Premium(super.getNome(),super.getLocal(),super.getPreco(),super.getNum(),this.estrela);
      for(Integer i : super.getOcupa())
      temp.add(i);
      return temp;
  }
}