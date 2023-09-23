
import java.util.ArrayList;
import java.util.HashSet;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Camiao {
    private String matricula;
    private String localizacao;
    private int cubicagem;
    private boolean refrigeracao;
    private ArrayList<Servico> atuais;
    private ArrayList<Servico> historico;
    private HashSet<String> cargas;

    public Camiao(String matricula, String localizacao, int cubicagem,boolean refrigeracao) {
        this.matricula = matricula;
        this.localizacao = localizacao;
        this.cubicagem = cubicagem;
        this.atuais = new ArrayList<Servico>();
        this.historico = new ArrayList<Servico>();
        this.cargas = new HashSet<>();
    }

    public String getMatricula() {
        return this.matricula;
    }
    public String getLocalizacao() {
        return this.localizacao;
    }
    public int getCubicagem() {
        return this.cubicagem;
    }
    private boolean getRefrigeracao() {
        return this.refrigeracao;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void setCubicagem(int cubicagem) {
        this.cubicagem = cubicagem;
    }

    public void addCarga(String s){
        String s1 = new String();
        s1=toLowerCase(s);
        if(s.equals("liquidas") || s.equals("normais") || s.equals("perigosas") || s.equals("perecivel")){
            System.out.print("Já existe esta carga disponivel neste camião.");
        }else{
            this.cargas.add(s);
        }
    }
    public HashSet<String> getCargas(){
        HashSet<String> repetidos = new HashSet<>();
        for(String novo : this.cargas){
            repetidos.add(novo);
        }
        return repetidos;
    }
    public void getAtuais() {
        System.out.println("Serviços atuais:");
        for(Servico s: atuais){
            System.out.println(s.toString());
        }
    }
    public void getHistorico() {
        System.out.println("Histórico de serviços:");
        for(Servico s: historico){
            System.out.println(s.toString());
        }
    }
    public ArrayList<Camiao> historico(){
        ArrayList <Camiao> novo = new ArrayList<Camiao>();
        for(Camiao aux : this.historico()){
            novo.add(aux);
        }
        return novo;


    }


    public Camiao clone(){
        Camiao novo = new Camiao(this.getMatricula(), this.getLocalizacao(), this.getCubicagem(),this.getRefrigeracao());
        for(Servico s: atuais){
            novo.atuais.add(s.clone());
        }
        for(Servico s: historico){
            novo.historico.add(s.clone());
        }
        return novo;
    }

    public void addServico(Servico s){
        this.atuais.add(s);
    }
    public void removeServicoAtual(Servico s){
        this.historico.add(s);
        this.atuais.remove(s);
    }

}