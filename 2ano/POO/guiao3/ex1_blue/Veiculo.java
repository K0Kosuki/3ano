import javax.swing.text.html.HTMLEditorKit.LinkController;

public class Veiculo {
    private String matricula;
    private double Km;
    private double capacidade;
    private double estado;
    private double media;
    private int viagen;
    private double gasto;
    public static final int RESERVA = 10;

    Veiculo(String matricula,double km, double capacidade, double gasto,double media) {
        this.Km = Km;
        this.capacidade = capacidade;
        this.gasto = gasto;
        this.matricula = matricula;
        this.media = media;
    }

    public String getmatricula(){
    return this.matricula;
    }
    
    public double getKm() {
        return this.Km;
    }

    public double setgasto(double gasto) {
        return this.gasto = gasto;
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    public double getestado() {
        return this.estado = estado;
    }

    public int getviagen() {
        return this.viagen = viagen;
    }

    public String setmatricula(String matricula) {
        return this.matricula;
    }

    public double setkm(double Km) {
        return this.Km;
    }

    public int setviagen(int viagen) {

        return this.viagen;
    }

    public double setcapacidade(double Capacidade) {
        return this.capacidade;
    }

    public double autonomia() {
        return estado * 100 / media;
    }

    private double gasto(double K) {
        return K * this.media / 100;
    }

    public boolean viagen(double K) {
        if (this.autonomia() > K) {

            this.viagen++;
            this.viagen += K;
            this.estado -= this.gasto(K);

            return true;
        } else {
            return false;
        }

    }

    public boolean reserva() {
        return this.estado <= Veiculo.RESERVA;
    }

    public double valormedio(double custo) {

        return this.gasto(this.Km);
    }

    public double custoKm(double custo) {
        return this.valormedio(custo) / Km;
    }

    public double atestar(int L) {
        if (this.estado + L > this.capacidade) {
            this.estado = this.capacidade;
            return this.capacidade - this.estado + L;
        } else {
            this.estado += L;
            return 0;
        }
    }
    
    public Veiculo clone(){
    return new Veiculo(this);
    }
}
