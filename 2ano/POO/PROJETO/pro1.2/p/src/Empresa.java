import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Empresa {

    private String nome;
    private ArrayList<Camiao> Camioes;
    private Map<String,Hub> Mapa;
    private ArrayList<Servico> servicos;
    private ArrayList<Cliente> clientes;

    public Empresa(String nome){
        this.nome = nome;
        this.Camioes = new ArrayList<Camiao>();
        this.Mapa = new HashMap<String,Hub>();
        this.servicos = new ArrayList<Servico>();
        this.clientes = new ArrayList<Cliente>();
    }
    public void criar_Cliente(int nif, String nome, String endereco) { //cria um cliente, e averigua se existe:caso n exista adiciona à lista clientes;
        boolean existe = false;
        for(Cliente aux : this.clientes){
            if(aux.getNif() == nif) existe=true;
        }
        if(existe == false) {
            Cliente novo = new Cliente(nif, nome, endereco);
            this.clientes.add(novo);
        }else{
            System.out.println("Já está registado!");
        }
    }


    public void criar_servico(Cliente c,int codigo, int data,String origem,String destino,String carga){
        c.criar_servico(codigo,c.getNif(),data,origem,destino,carga);
        Servico novo = new Servico(codigo,c.getNif(),data,origem,destino,carga);
        this.servicos.add(novo);
        ArrayList<Camiao> temp= new ArrayList<>();

        for(Camiao aux : this.Camioes){
            if(aux.getLocalizacao().equals(origem)) {
                for(String cargas : aux.getCargas())
                    if(cargas.equals(carga))
                    temp.add(aux.clone());
            }
        }
    }


    public void camioes_to_hubs(){
        
        for(Camiao c: this.Camioes){
            for(Hub h: this.Mapa.values()){
                if(c.getLocalizacao().equals(h.getNome())){
                    h.addCamiao(c.clone());
                }
            }
        }
    }
    public void addCamiao(Camiao c){
        boolean existe = false;
        for(Camiao novo : this.Camioes){
            if(novo.getMatricula().equals(c.getMatricula()))
                existe = true;
        }
        if(existe == false) {
            this.Camioes.add(c);
            this.camioes_to_hubs();
        }  else{
                System.out.println("Já existe este camião, por favor compre um novo!");
        }
    }

    public void criar_camiao(String matricula, String localizacao, int cubicagem,boolean refrigeracao,String tipo_carga1, String tipo_carga2, String tipo_carga3, String tipo_carga4){
        boolean existe = false;
        for(Camiao aux : this.Camioes){
            if(aux.getMatricula().equals(matricula));
                existe = true;
        }
        if(existe == false) {
            Camiao novos = new Camiao(matricula,localizacao,cubicagem,refrigeracao);
            novos.addCarga(tipo_carga1);
            novos.addCarga(tipo_carga2);
            novos.addCarga(tipo_carga3);
            novos.addCarga(tipo_carga4);
            this.addCamiao(novos);
            }else{
            System.out.println("Já existe este camião, por favor compre um novo!");
        }
    }
    public void criar_camiao(String matricula, String localizacao, int cubicagem,boolean refrigeracao,String tipo_carga1, String tipo_carga2, String tipo_carga3){
        boolean existe = false;
        for(Camiao aux : this.Camioes){
            if(aux.getMatricula().equals(matricula));
            existe = true;
        }
        if(existe == false) {
            Camiao novos = new Camiao(matricula,localizacao,cubicagem,refrigeracao);
            novos.addCarga(tipo_carga1);
            novos.addCarga(tipo_carga2);
            novos.addCarga(tipo_carga3);
            this.addCamiao(novos);
        }else{
            System.out.println("Já existe este camião, por favor compre um novo!");
        }
    }
    public void criar_camiao(String matricula, String localizacao, int cubicagem,boolean refrigeracao,String tipo_carga1, String tipo_carga2){
        boolean existe = false;
        for(Camiao aux : this.Camioes){
            if(aux.getMatricula().equals(matricula));
            existe = true;
        }
        if(existe == false) {
            Camiao novos = new Camiao(matricula,localizacao,cubicagem,refrigeracao);
            novos.addCarga(tipo_carga1);
            novos.addCarga(tipo_carga2);
            this.addCamiao(novos);
        }else{
            System.out.println("Já existe este camião, por favor compre um novo!");
        }
    }
    public void criar_camiao(String matricula, String localizacao, int cubicagem,boolean refrigeracao,String tipo_carga1){
        boolean existe = false;
        for(Camiao aux : this.Camioes){
            if(aux.getMatricula().equals(matricula));
            existe = true;
        }
        if(existe == false) {
            Camiao novos = new Camiao(matricula,localizacao,cubicagem,refrigeracao);
            novos.addCarga(tipo_carga1);
            this.addCamiao(novos);
        }else{
            System.out.println("Já existe este camião, por favor compre um novo!");
        }
    }




    public void String() {
        System.out.println("Empresa: " + this.nome + "\n");
        System.out.println("Mapa:");

        for(String h_nome: this.Mapa.keySet()) {
            System.out.print( h_nome+"\t");
        }

        System.out.println("Camioes: ");
        Iterator<Camiao> i = this.Camioes.iterator();
        while (i.hasNext()) {
            Camiao camiao = i.next();
            System.out.print( camiao.getLocalizacao()+"\t");
        }
        System.out.println("Servicos: " + this.servicos + "\n");
    }
    public void printCamiao(String matri){
        for(Camiao c: this.Camioes){
            if(c.getMatricula().equals(matri)){
                System.out.println("Matricula: " + c.getMatricula());
                System.out.println("Localização: " + c.getLocalizacao());
                System.out.println("Cubicagem: " + c.getCubicagem());
                System.out.println("Tem refrigeração: " + c.getRefrigeracao());
                System.out.println("Serviços atuais:");
                for(Servico s: c){
                    System.out.println(Servico.printServico(s));
                }
                System.out.println("Histórico de serviços:");
                for(Servico c2: c.historico()){
                    System.out.println(Servico.printServico(s));
                }
            }
        }
    }

    public void printCliente(Cliente c){
        System.out.println("Nome: " + c.getNome());
        System.out.println("NIF: " + c.getNif());
        System.out.println("Morada: " + c.getMorada());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Telefone: " + c.getTelefone());
        System.out.println("Serviços atuais:");
        for(Servico s: atuais){
            s.printServico(s.clone());
        }
        System.out.println("Histórico de serviços:");
        for(Servico c2: c2.historico()){
           c2.printServico(c2.clone());
        }
    }
    public void printHub(String h){
        System.out.println("Nome: " + this.Mapa.get(h).getNome());
        System.out.println("Cidade: " + this.Mapa.get(h).getCidade());
        System.out.println("Morada: " + this.Mapa.get(h).getMorada());
        System.out.println("Email: " + this.Mapa.get(h).getEmail());
        System.out.println("Telefone: " + this.Mapa.get(h).getTelefone());
        System.out.println("Camioes: ");
        for(Camiao c: this.Mapa.get(h).getCamioes()){
            System.out.println(c.getMatricula());
        }
    }
    public void criar_hubs_default(){
        Hub Madrid = new Hub("Madrid",true);
        Madrid.addLigacao("Barcelona",630);
        Madrid.addLigacao("Porto",560);
        Madrid.addLigacao("Lisboa",625);

        Hub Lisboa = new Hub("Lisboa",true);
        Lisboa.addLigacao("Madrid",625);
        Lisboa.addLigacao("Porto",300);
        Hub Porto = new Hub("Porto",false);
        Porto.addLigacao("Madrid",560);
        Hub Barcelona = new Hub("Barcelona",true);
        Barcelona.addLigacao("Paris",1035);

        Hub Paris = new Hub("Paris",true);
        Paris.addLigacao("Porto",1574);

        this.Mapa.put("Madrid", Madrid);
        this.Mapa.put("Lisboa", Lisboa);
        this.Mapa.put("Porto", Porto);
        this.Mapa.put("Barcelona", Barcelona);
        this.Mapa.put("Paris", Paris);

    }
    public void criar_camioes_default(){
        Camiao c1= new Camiao("00-AA-00","Madrid",7, true);
        Camiao c2 = new Camiao("00-AA-01","Madrid",15, false);
        Camiao c3 = new Camiao("00-AA-02","Madrid",3, true);
        Camiao c4 = new Camiao("00-AA-03","Lisboa",7, false);
        Camiao c5 = new Camiao("00-AA-04","Lisboa",15, true);
        Camiao c6 = new Camiao("00-AA-05","Lisboa",3, false);
        Camiao c7 = new Camiao("00-AA-06","Porto",7, true);
        Camiao c8 = new Camiao("00-AA-07","Porto",15, false);
        Camiao c9 = new Camiao("00-AA-08","Porto",3, true);
        Camiao c10 = new Camiao("00-AA-09","Barcelona",7, false);
        Camiao c11 = new Camiao("00-AA-10","Barcelona",15, true);
        Camiao c12 = new Camiao("00-AA-11","Barcelona",3, false);
        Camiao c13 = new Camiao("00-AA-12","Paris",7, true);
        Camiao c14 = new Camiao("00-AA-13","Paris",15, false);
        Camiao c15 = new Camiao("00-AA-14","Paris",3, true);

        this.Camioes.add(c1);
        this.Camioes.add(c2);
        this.Camioes.add(c3);
        this.Camioes.add(c4);
        this.Camioes.add(c5);
        this.Camioes.add(c6);
        this.Camioes.add(c7);
        this.Camioes.add(c8);
    }

    public void addHub(String h_nome,Hub h){
        this.Mapa.put(h_nome, h);
    }

    public void removeHub(String h_nome){
        this.Mapa.remove(h_nome);
    }

    public Map<String,Object> get_min_dist(String origem_hub_nome, String destino_hub_nome) {

        Map<String, Integer> routeDistance = new HashMap<>();
        Map<String, String> routeMap = new HashMap<>();

        Integer inf = 99999999;

        for(String key: this.Mapa.keySet()) {
            routeDistance.put(key, inf);
            routeMap.put(key, "null");
        }

        routeDistance.put(origem_hub_nome, 0);

        for(int i=0; i < this.Mapa.size()-1; i++) {
            for(String origem_cidade: this.Mapa.keySet()) {
                for(String destino_cidade: this.Mapa.get(origem_cidade).ligacoes.keySet()){
                    Integer i1 = routeDistance.get(destino_cidade);
                    Integer i2 = this.Mapa.get(origem_cidade).ligacoes.get(destino_cidade);
                    Integer i3 = routeDistance.get(origem_cidade);
                    if (i1 > (i2 + i3)) {
                        routeDistance.put(destino_cidade,
                                this.Mapa.get(origem_cidade).ligacoes.get(destino_cidade) + routeDistance.get(origem_cidade)
                        );
                        routeMap.put(destino_cidade, origem_cidade);
                    }
                }
            }
        }

        for(String origem_cidade: this.Mapa.keySet()) {
            for(String destino_cidade: this.Mapa.get(origem_cidade).ligacoes.keySet()) {
                if (routeDistance.get(destino_cidade) >
                        (routeDistance.get(origem_cidade) + this.Mapa.get(origem_cidade).ligacoes.get(destino_cidade))) {
                    return null;
                }
            }
        }

        Integer min_distancia = routeDistance.get(destino_hub_nome);

        List<String> route = new ArrayList<String>();
        route.add(destino_hub_nome);
        String n;
        do {
            n = routeMap.get(destino_hub_nome);
            route.add(n);
            destino_hub_nome = n;
        } while(routeMap.get(destino_hub_nome) != "null");

        Collections.reverse(route);

        Map<String,Object> r = new HashMap<String,Object>();
        r.put("min_distancia", min_distancia);
        r.put("route", route);

        return r;
    }
}
