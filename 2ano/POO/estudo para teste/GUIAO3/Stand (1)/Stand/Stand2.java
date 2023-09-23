

public class Stand2
{
/**
 * Esta classe usa arrays (versão mais simples)
 */
    // instance variables - replace the example below with your own
    private String nome;
    private Veiculo[] lista;
    private int index;

    private static final int TAM = 10;
    /**
     * Constructor for objects of class Stand
     */
    public Stand2()
    {
        this.nome = "SS";
        this.lista = new Veiculo[Stand2.TAM];
        this.index = 0;
    }

    
    public Stand2(String n, int tam)
    {
        this.nome = n;
        this.lista = new Veiculo[tam];
        this.index = 0;
    }
    
    public boolean adicionar(String m, int kms, int cap, int l, double med, int v)
    { 
        if(this.index < this.lista.length)
        {
            this.lista[this.index++] = new Veiculo(m,kms,cap,l,med,v); 
            return true;
        }
        else
            return false;
    }
    public boolean adicionar(Veiculo v)
    {
        if(this.index < this.lista.length)
        {
            this.lista[this.index++] = v.clone(); 
            return true;
        }
        else
            return false;
    }
    
    public boolean vender(String m)
    {
        // para vocês completarem como exercício
        return(false);
    }
    
       
    
    public int numveiculos()
    { return this.index; }
    
    
    public String maisuso()
    {
        
        Veiculo temp = this.lista[0];
        for(int i=0; i < this.index; i++)
            if(this.lista[i].getKms() > temp.getKms())
            { temp = this.lista[i];}
            
        return temp.getMatricula();
    }
    
    public long totalgas()
    {
        long total = 0;
        for(int i=0; i < this.index; i++)
            total += this.lista[i].getLitros();
            
        return total;
    }
    
    public String veiculosViagem(int k)
    {
        String tmp = "";
        
        for(int i=0; i < this.index; i++)
            if(this.lista[i].autonomia() >= k * 2)
                tmp += this.lista[i].getMatricula()+";";
                
        return tmp;
        
    }
}


