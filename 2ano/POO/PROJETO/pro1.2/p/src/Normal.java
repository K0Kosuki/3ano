public class Normal extends Carga
{
    private static String nome = "Normal";
    private double precoDaCarga=15;
    private double fixo=5;
    private double preco;

    public Normal(int c, int cu, double p) {
        super(c,cu,p);
    }

    public void setFixo(double f){
        this.fixo=f;
    }
    public double getFixo(){
        return this.fixo;
    }
    public double getPrecoDaCarga() {
        return precoDaCarga;
    }

    public void setPrecoDaCarga(double precoDaCarga) {
        this.precoDaCarga = precoDaCarga;
    }

    public double consumo() {
        return getFixo();
    }

    public double preco(double gasto, Empresa e, String o, String d, String nome, int nif, String endr){
        Cliente cli=new Cliente(nif, nome, endr,false);
        Servico servico = new Servico();
        if(Cliente.getFrequente()==true){
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

        clig.getGasto()+=preco;
        return preco;
    }
}