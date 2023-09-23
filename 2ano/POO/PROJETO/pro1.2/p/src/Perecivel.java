public class Perecivel extends Carga
{
    private static String nome = "Perecivel";
    private double precoDaCarga=25;

    public Perecivel(int c, int cu, double p) {
        super(c,cu,p);
    }

    public double getPrecoDaCarga() {
        return precoDaCarga;
    }

    public void setPrecoDaCarga(double precoDaCarga) {
        this.precoDaCarga = precoDaCarga;
    }

    public double consumo() {
        return super.getPeso()*servico.distancia(e,o,d);
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

        cli.getGasto()+=preco;
        return preco;
    }
}
