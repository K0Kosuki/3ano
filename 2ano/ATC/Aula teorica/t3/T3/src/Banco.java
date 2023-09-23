import javax.xml.ws.handler.PortInfo;

public class Banco {
   private String nome;
   private Conta contas[];

   public Banco(String n){
    this.nome = n;
    this.contas = new Contas[Banco.TAM];

   }

   public void criar(Stirng n,double si){
    Conta c = new Conta(n,si);
    this.contas[Banco.index++]=c
   }
}

