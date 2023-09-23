import java.util.*;
import java.util.ArrayList;
public class SMS extends Chamada
{
 private String texto;
 private ArrayList<String> lista;
 
 
 public SMS(int ori,int cara,double preco,String tex)
 {
     super(ori,cara,preco);
     ArrayList<String> lista = new ArrayList<String>();
     this.texto = tex;
 }
public String getTexto()
  { return this.texto;}

  public int getDura()
  {
      return this.texto.length();
  }
  
  
 public void add(String c) 
 {
     this.lista.add(c);
 }
 
 /*public Chamada find(int ori)
 {
     Chamada contar =null;
     Iterator<Chamada> i = lista.iterator();
     boolean ha= false;
     while(i.hasNext() && !ha)
     {
         contar = i.next();
         if(contar.getOrigem() ==ori)
         {
             ha = true;
         }
     }
     if(ha)
     {
         return contar;
     }
     else
     return null;
 }
 */
 
 public double valor()
 {
   return this.getDura()*0.001;
 }
 
 public SMS clone()
    {
        return new SMS(super.getOrigem(),super.getDuracao(),super.getPreco(),this.texto);
    }
 
 
}
