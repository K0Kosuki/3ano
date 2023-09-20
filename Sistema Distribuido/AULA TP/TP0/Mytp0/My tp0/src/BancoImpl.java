import javax.print.DocFlavor;
import java.sql.ClientInfoStatus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class BancoImpl implements Banco {

    private int counter;
    private HashMap<Integer, Client> account;

public BancoImpl(){
    account = new HashMap<>();
    counter=0;
}
private class Client {
    private String name;
    private String cc;
    private int value ;


public Client(String name, String cc)
    {
        this.name = name;
        this.cc = cc;
        value = 0;
    }

    public String getName() {
        return this.name;
    }
    public  String getCC() {
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
    public int open(String name, String cc) {
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
      }else {
          System.out.println("não existe cliente");
          return 0;
      }

    }

    @Override
    public boolean deposit(int id, int value) {

    if(this.account.containsKey(id)){
        Client aux= this.account.get(id);
        aux.setValue(value);
        return true;
    }else
    {
        System.out.println("Não exite cliente");
        return false;
    }
    }

    @Override
    public boolean withdraw(int id, int value) {
        Client aux =  this.account.get(id);
        int auxvalue=aux.getValue()-value;
        aux.setValue(auxvalue);
        return true;
    }

    @Override
    public String name(int id) {
        if(this.account.containsKey(id)){
            Client auxname= account.get(id);
            return auxname.getName();
        }else
        {
            System.out.println("nao exite cliente");

        }
        return null;
    }

    @Override
    public String cc(int id) {
    if(account.containsKey(id)) {
        Client auxname = account.get(id);
        return auxname.getCC();
    }else
    {
        return ("nao exite");
    }
    }

    public int totalBalance(){
    int total = 0;

    for(int i=0; i<account.size(); i++){
        if(account.containsKey(i))
        {
            Client client = account.get(i);
            int value = client.getValue();
            total += value;
        }else
        {
            return 0;
        }
    }

    return total;}

    @Override
    public int totalBalanceI() {
    int total=0;
        Iterator<Integer> it =account.keySet().iterator();
        while (it.hasNext())
        {
            Integer id = it.next();
            Client client = account.get(id);
            int value = client.getValue();
            total += value;
        }
        return total;
    }


}
