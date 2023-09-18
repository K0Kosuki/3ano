import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;
public class BancoImpl implements Banco {

    private int counter;
    private HashMap<Integer, Client> account;

public BancoImpl(){
    account = new HashMap<>();
    counter=0;
}
public class Client {
    private String name;
    private int cc;
    private int value ;


public Client(String name, int cc)
    {
        this.name = name;
        this.cc = cc;
        value = 0;
    }

    public String getName() {
        return this.name;
    }
    public  int getCC() {
    return this.cc;
    }
    public int getValue() {
    return this.value;
    }
    public int setValue(int value) {
    this.value=value;
    return value;
    }

}

    @Override
    public int open(String name, int cc) {
    int id =counter;
    Client newClient = new Client(name,cc);
    this.account.put(id,newClient);
    counter++;
    return  id;
    }

    @Override
    public int balance(int id) {
        Client client = account.get(id);
      if(this.account.containsKey(id)){
          if (client != null) {
              return client.getValue();
          }
          else {
              System.out.println("não existe cliente");
              return 0;
          }
      }
    }

    @Override
    public boolean deposit(int id, int value) {
        return false;
    }

    @Override
    public boolean withdraw(int id, int value) {
        return false;
    }

    @Override
    public String name(int id) {
        return null;
    }

    @Override
    public String cc(int id) {
        return null;
    }
}
