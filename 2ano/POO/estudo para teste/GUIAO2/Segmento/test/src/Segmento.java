public class Segmento {
    private Ponto a, b;

    public Segmento(double x1, double y1, double x2, double y2) {
        this.a = new Ponto(x1, y1);
        this.b = new Ponto(x2, y2);

    }

    public double comprimento() {
        return Math.sqrt(Math.pow(this.a.getX() - this.b.getX(), 2) + Math.pow(this.a.getY() - this.b.getY(), 2));
    }

    public double declive() {
        return (this.a.getY() - this.b.getY()) / (this.a.getX() - this.b.getX());
    }

    public String Up_or_Downn() {
        if (declive() > 0) {
            return ("up");
        } else {
            return ("down");
        }
    }
}
