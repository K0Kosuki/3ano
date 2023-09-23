
/**
 * Escreva uma descrição da classe Parafuso aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Parafuso implements Componente
{
    private int codigo;
    private int valor;
    
 public Parafuso(int c,int v)
 {
     this.codigo=c;
     this.valor= v;
 }
 
 public double custo()
 {
     return 2*this.valor;
 }
 
 public int getCod()
 {
     return this.codigo;
 }
    
}
