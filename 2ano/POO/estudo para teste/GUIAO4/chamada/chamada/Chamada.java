
public abstract class Chamada
{
	private int origem;
	private int duracao;
	private double preco; 	

	Chamada(int a, int b, double c)
	{ this.origem = a; this.duracao = b; this.preco = c;}

	public int getOrigem()
	{ return this.origem;}
	public int getDuracao()
	{ return this.duracao;}
	public double getPreco()
	{ return this.preco;}

	public abstract double valor();
	public abstract Chamada clone();
}
