import java.util.ArrayList;
public class Cliente {
    private int nif;
    private int numServ =0;
    private double gasto=0;
    private String nome;
    private String endereco;
    private boolean frequente;
    private ArrayList<Servico> listaServicos;

    public Cliente(int nif, String nome, String endereco) {
        this.nif = nif;
        this.nome = nome;
        this.frequente = false;
        this.gasto=0.0;
        this.endereco = endereco;
        this.listaServicos = new ArrayList<Servico>();
    }

    public void addServico(Servico s){
        this.listaServicos.add(s);
    }

    public void removeServico(Servico s){
        this.listaServicos.remove(s);
    }

    public void criar_servico(int codigo,int nif,int data,String origem,String destino,String carga){
        Servico s = new Servico(codigo,this.nif,data,origem,destino,carga);
        this.listaServicos.add(s);


    }
    public int numServicos(){
        for(Servico c: listaServicos){
            numServ++;
        }
        return numServ;
    }

    public int getNif() {
        return nif;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public boolean getFrequente() {
        return frequente;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setFrequente(boolean frequente) {
        this.frequente = frequente;
    }

    public Cliente clone(){
        Cliente novo = new Cliente(this.nif, this.nome, this.endereco, this.frequente);
        return novo;
    }

    public boolean equals(Cliente c){
        boolean igual = true;
        for(Servico s: listaServicos){
            if(s.equals(c)){
                igual = false;
            }
        }
        if(this.nif==c.getNif() && this.nome.equals(c.getNome()) && this.endereco.equals(c.getEndereco()) && this.frequente==c.getFrequente() && igual) {
            return true;
        }else return false;
    }
}