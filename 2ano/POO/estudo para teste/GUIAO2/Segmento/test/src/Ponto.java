public class Ponto{

private double x,y;

    public Ponto() {
        this.x = 0.0;
        this.y = 0.0;
       
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
       
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double setX(double x) {
    return this.x = x;
    }

    public double setY(double y) {
        return this.y = y;
    }
    
}