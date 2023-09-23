
public class Ingrediente
{
      private String nome;
      private int quantidade;
      private String unidades;
      private int calorias;

        public Ingrediente(String n, int q, String u, int c)
    {
        this.nome = n;
        this.quantidade = q;
        this.unidades = u;
        this.calorias = c;
    }

    public String getNome()
    { return this.nome;}
    public int getQty()
    { return this.quantidade;}
    public String getUni()
    { return this.unidades;}
    public int getCal()
    { return this.calorias;}

   
   public Ingrediente  clone()
    { 
        return new Ingrediente(this.nome,this.quantidade,this.unidades,this.calorias);
    }
}
