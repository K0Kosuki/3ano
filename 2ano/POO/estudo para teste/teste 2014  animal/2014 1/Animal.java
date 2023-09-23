public abstract class Animal
{ private int codigo;
private int peso;
private double residuos;
Animal(int c, int p, double r)
{ this.codigo = c; this.peso = p; this.residuos = r;}
public int getCodigo()
{ return this.codigo;}
public int getPeso()
{ return this.peso;}
public double getResiduos()
{ return this.residuos;}
public abstract double valor();
public abstract double custo();
public abstract Animal clone();
}