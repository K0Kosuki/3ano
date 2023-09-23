import java.util.*;
public abstract class Veiculo{
private String matricula;
private ArrayList<Contratavel> servicosContratados;
private double custoPorKm;

public Veiculo(String matri,double cpK){
this.matricula=matri;
this.custoPorKm=cpK;
this.servicosContratados = new ArrayList<Contratavel>();
}
public Veiculo(Veiculo v){

    this.matricula=v.getMatricula();
    this.custoPorKm=v.getCusto();
    this.servicosContratados=new ArrayList<Contratavel>();
}
public void add(Contratavel contra){
    this.servicosContratados.add(contra);
}

public String getMatricula(){
    return this.matricula;
}

public double getCusto(){
    return this.custoPorKm;
}

public ArrayList<Contratavel> getServico(){
ArrayList<Contratavel> temp= new ArrayList<Contratavel>();
for(Contratavel contra:this.servicosContratados)
temp.add(contra);
return temp;

}

public Veiculo clone()
    { 
        return new Veiculo(this.matricula,this.custoPorKm,this.servicosContratados);
    }



}



}


