public class Liquidas extends Carga{

    private static String nome = "Liquidas";
    private double precoDaCarga=20;
    private double energia=5;
    private double preco;

    public Liquidas(int c, int cu, double p) {
        super(c,cu,p);
    }

    public double getEnergia(){
        return this.energia;
    }
    public void setEnergia(double e){
        this.energia=e;
    }

    public double getPrecoDaCarga() {
        return precoDaCarga;
    }
    public void setPrecoDaCarga(double precoDaCarga) {
        this.precoDaCarga = precoDaCarga;
    }

    public double consumo() {
        return super.getCubicagem()*getEnergia();
    }

    public double preco(double gasto,Empresa e,String o,String d,String nome,int nif,String endr) {
        Cliente cli=new Cliente(nif, nome, endr,false);
        Servico servico = new Servico();
        if(cli.getFrequente()==true){
            if(gasto<=5000){
                preco=0.999*(super.getCubicagem()/5)*(servico.distancia(e,o,d)/100)+getPrecoDaCarga();
            }
            if(5000<gasto && gasto<=10000){
                preco=0.993*(super.getCubicagem()/5)*(servico.distancia(e,o,d)/100)+getPrecoDaCarga();
            }
            if(10000<gasto && gasto<=15000){
                preco=0.987*(super.getCubicagem()/5)*(servico.distancia(e,o,d)/100)+getPrecoDaCarga();
            }
            if(15000<gasto && gasto<=20000){
                preco=0.981*(super.getCubicagem()/5)*(servico.distancia(e,o,d)/100)+getPrecoDaCarga();
            }
            if(25000<=gasto){
                preco=0.975*(super.getCubicagem()/5)*(servico.distancia(e,o,d)/100)+getPrecoDaCarga();
            }
        } else {
            preco=(super.getCubicagem()/5)*(servico.distancia(e,o,d)/100)+getPrecoDaCarga();
        }
        cli.getGasto()+=preco;
        return preco;
    }
}