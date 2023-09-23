
/**
 * Correção do Exem de recurso 2018/19
 * Classe empresa que contém os métodos pedidos na pergunta 2)
 */
import java.util.*;
public class Empresa
{
    // instance variables - replace the example below with your own
    private HashMap<Integer,Placa> lista;

    /**
     * Constructor for objects of class Empresa
     */
    public Empresa()
    {
        // initialise instance variables
        this.lista = new HashMap<Integer,Placa>();
    }

    public void add(Placa p)
    { 
        if(p != null)
            this.lista.put(p.getCodigo(),p.clone()); 
    }
    
    // 2.2)
    public int maisValor()
    {
        int maxc = 0;
        double max = 0.0;
        for(Integer i:this.lista.keySet())
        {
            double temp = this.lista.get(i).valor_total();
            if(temp > max)
            { maxc = i; max = temp;}
        }
        
        return maxc;
    }
    
    // 2.3) componente mais usado na empresa
    public int mais_frequente()
    {
        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>(); // relaciona componente com qty!
        for(Placa p: this.lista.values())
        {
            Map<Integer,Integer> atual = p.compUsados();
            for(Integer i:atual.keySet())
                if(temp.containsKey(i))
                    temp.put(i,temp.get(i) + atual.get(i));
                else
                    temp.put(i,atual.get(i));
        }
        
        // calcular maximo
        int maxc = 0, max = 0;
        for(Integer i:temp.keySet())
            if(temp.get(i) > max)
            { maxc = i; max = temp.get(i); }
                
        return maxc;
    }
    
    // 2.4) Map de componente para placas.
    public Map<Integer,TreeSet<Placa>> componentes_placas()
    {
        HashMap<Integer,TreeSet<Placa>> temp = new HashMap<Integer,TreeSet<Placa>>();
        
        for(Placa p: this.lista.values())
            for(Integer i: p.compUsados().keySet())
                if(!temp.containsKey(i))
                {   
                    // TreeSet com ordenação por tamanho da lista de circuitos em cada placa.
                    TreeSet<Placa> aux = new TreeSet<Placa>((p1,p2) -> p1.tamanho() - p2.tamanho());
                    aux.add(p.clone());
                    temp.put(i,aux);
                }
                else
                {
                    temp.get(i).add(p.clone());
                }
                
        return temp;
            
    }
    
    //2.5 Par de circuitos com mais componentes em comum.
    // Várias possiveis soluções, umas mais eficientes que outras.
    // Esta faz a travessia da lista de Placas para iterar sobre
    // os circuitos e obter a interseção das listas de componentes!
    public String pares()
    {
        String maxp = "";
        int max = 0;
        for(Placa p: this.lista.values())
        {
            Map<Integer,Set<Integer>> aux = p.circuComps();
            
            for(Placa p2: this.lista.values())
            {
                
                // se forem duas placas diferentes
                if(p.getCodigo() != p2.getCodigo())
                {
                    Map<Integer,Set<Integer>> aux2 = p2.circuComps();
                    
                    // iterar sobre circuitos e obter interseção das duas listas de comps
                    for(Integer i: aux.keySet())
                        for(Integer i2: aux2.keySet())
                        {
                            if( i != i2 )  // os circuitos têm de ser diferentes!!
                            {
                                // verifica qual a lista mais pequena
                                Set<Integer> set1 = aux.get(i);
                                Set<Integer> set2 = aux2.get(i2);
                                if(set1.size() > set2.size())
                                {
                                    Set<Integer> tt = set2;
                                    set2 = set1;
                                    set1 = tt;
                                }
                                // medir tamanho da interseção entre set1 e set2.
                                // Ambas as coleções de comps estão ordenadas!
                                // Logo começar pela mais pequena e verificar ocorrencia na maior.
                                // Parar quando falhar...
                                int conta = 0;
                                Iterator xx = set1.iterator();
                                while(xx.hasNext() && set2.contains(xx.next()))
                                    conta++;
                                    
                                // verifica se é máximo!
                                if(conta > max)
                                { max = conta; maxp = i +"/"+ i2; }
                            }
                        }   
                            
                }
            }
        }
        
        return maxp;
    }
    
}
