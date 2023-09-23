import java.util.*;
public class Standard extends Hotel
{
 
    
  public Standard(String n,String l,double p,int num)
  {
     super(n,l,p,num);     
  }
  
  
  public double dormida(int mes)
  {
      return super.getPreco();
      
  }
  public Standard clone()
  {
      Standard temp = new Standard(super.getNome(),super.getLocal(),super.getPreco(),super.getNum());
      for(Integer i:super.getOcupa())
      temp.add(i);
      return temp;
  }
}
