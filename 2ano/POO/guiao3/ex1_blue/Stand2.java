
import java.util.*;

public class Stand2 {

    private String novo_matricula;
    private ArrayList<Veiculo> list;
    private int n_estacionar;
    private int tamanho;

    Stand2(String novo_matricula, int tamanho) {
        this.novo_matricula = novo_matricula;
        
        this.tamanho = tamanho;
        this.list = new ArrayList<Veiculo>();
    }

public boolean add(String novo_matricula,double Km,double capacidade,double viagem,double gasto){
    if(list.size()<this.tamanho)
    {
        this.list.add(new Veiculo(novo_matricula,Km,capacidade,viagem,gasto));
        return true;  
    }
    else
    {
        return false;
    }
}

    public boolean vende_remove(String novo_matricula) {
        boolean ret = false;
        Iterator<Veiculo> i = this.list.iterator();
        while (i.hasNext() && !ret) {
            Veiculo v = i.next();
            if (Veiculo.getmatricula().equals(novo_matricula)) {
                i.remove();
                ret = true;
            }
            return (ret);
        }
       
    }

    public int numero_veiculos() {
        return this.list.size();
    }

    public ArrayList<String> Veiculoviagem(int Km)
    {
        ArrayList<Veiculo> temp = new ArrayList<Veiculo>();
        
        for(Veiculo v:this.list)
            if(v.autonomia()>=Km*2)
                temp.add(v.clone());
                
        return temp;
    }
    public double mediaviagens() {

    }
    
    public long totalgas(){
    long total = 0;
    for(Velculo v : this.list)
    totall
}
    
    
}
