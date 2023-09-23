import java.time.chrono.ThaiBuddhistChronology;

public class Complexo{
    private double real,imag;

    public Complexo() {
        this.real=0.0; this.imag=0.0;
    }

    public Complexo(double a,double b){
        this.real=a; this.imag=b;
    }
    public double getReal(){
        return this.real;
    }
    public double getImag(){
        return this.imag;
    }
    public void setReal(double a){
        this.real =a;
    }
    public void setImag(double b)
{
    this.imag = b;
}

public Complexo soma(Complexo c){
return new Complexo(this.real + c.getReal(),   this.imag + c.getImag());
}

}


