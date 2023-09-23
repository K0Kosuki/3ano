//TABELA DE DESCONTOS
//até 5000€ desconto de 0.1%,
//até 10000€ desconto de 0.7%
//até 15000€ desconte de 1.3%
//até 20000€ desconto de 1.9%
//acima de 20000€ desconto de 2.5%
public abstract class Carga {
    private int codigo;
    private int cubicagem;
    private double peso;

    public Carga(int c, int cu, double p){
        this.codigo=c;
        this.cubicagem=cu;
        this.peso=p;
    }

    public Carga(){
        this.codigo=12243;
        this.cubicagem=23;
        this.peso=10.0;
    }

    public abstract double consumo();
    public abstract double preco();

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCubicagem() {
        return cubicagem;
    }
    public void setCubicagem(int cubicagem) {
        this.cubicagem = cubicagem;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}