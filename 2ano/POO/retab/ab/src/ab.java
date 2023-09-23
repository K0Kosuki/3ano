public class ab {

    private double altura;
    private double base;

    ab() {

    }

     ab(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

public double getaltura() {
    return this.altura;
}
public void setaltura(double altura) {
    this.altura = altura;
}

public double getbase() {
    return this.base;
}

public void setbase(double base) {
    this.base = base;
}

public double area() {
return  (Math.pow(getbase(),2)+ Math.pow(getaltura(),2));
}
public double pri () {
    return 2*getaltura()+2*getbase();
}

}