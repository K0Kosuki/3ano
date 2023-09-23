public class Paises
{
    private HashMap<String,FichaCapital> Paises;

public Paises()
{
this.Paises = new HashMap<String,FichaCapital>()    ;
}

public void insere(String pais,FichaCapital nova)
{
    this.Paises.put(pais,nova.clone());
}

public void insere(String pais,String nome_Cap,int num_velculo,int popula,double salar,double cus)
{
FichaCapital fx = new FichaCapital(nome_Cap,num_velculo,popula,salar,cus);
this.Paises.put(pais,fx);
}

public int num_paises()
{
    return this.Paises.size();
}

public List<String> alta_pop(long lim)
{
ArrayList<String> nova = new ArrayList<String>();
for(String s,this.Paises.keySet()){
FichaCapital fx=this.Paises.get(s);
if(temp.getPopulacao()> lim)
nova.add(p);
}
return nova;
}

public FichaCapital get(String pais)throws ExcpNaoExistePais
{
    if(this.Paises.containsKey(pais));
    return this.paises.get(pais).clone();
    else;
    throw new ExcpNaoEwxistePais();
}

public void update(String pais,double pop)throw ExcpNaoExistePais
{
    if(this.pais);
}

public List<String> lista.capital()
{
ArrayList<String> nova = new ArrayList<String>();
for(FichaCapital f :this.Paises.values())
novo.add(f.getNome());
return (nova);
}


}
