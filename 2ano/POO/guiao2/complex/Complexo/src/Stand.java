import java.util.List;
import java.util.ArrayList;

public class Stand

private String nome ;
private int index ;
private Veiculo[] lista;

private static final int TAN = 10;

public Stand(){
    this.nome = "fdsjkhdsfadashk";
    this.index =0;
    this.lista = new Veiculo[Stand.TAN];
}

public boolean add(Veiculo V){
if(this.index >=this.lista.length){
    return false;
}else{
    this.lista[this.index++] = V.clone() ;
    return true;
}

List<String> a = new ArrayList();


}
 
 