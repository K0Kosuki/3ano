import java.util.*;

public class Crometro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int km;
    private int tempo;
    private ArrayList<Kmt>[][] tp;
    
    public Crometro(int k ,int t)
    {
      this.km=k;
      this.tempo =t;
     
    }

   public void add(int k,int t)
   {
       this.tp.add(k,t);
   }
    
}
