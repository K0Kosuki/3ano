import java.util.HashMap;
import java.util.Map;

public class BancoImpl implements Banco {

    private Map<Integer,Conta> contas;
    private int counter;
    public BancoImpl(){
        contas=new HashMap<>();
        counter=0;
    }
    @Override
    public int open(String nome,String cc) {
        int id=counter;
        contas.put(id,new Conta(nome,cc));
        counter++;

        return id;
    }

    @Override
    public int balance(int id) {

    if (this.contas.containsKey(id))
    {
        return this.contas.get(id).getBalance();
    }
    else
    {
        return -1;
    }

    }

    @Override
    public boolean deposit(int id, int value) {

        if(this.contas.containsKey(id))
        {
            Conta a=this.contas.get(id);
            a.setBalance(value+a.getBalance());
            this.contas.put(id,a);
            return true;
        }
        else
        {
            return false;
        }

    }

    @Override
    public boolean withdraw(int id, int value) {

        if(this.contas.containsKey(id))
        {
            Conta a=this.contas.get(id);
            int balance=a.getBalance();
            if(balance>=value)
            {
                a.setBalance(balance-value);
                this.contas.put(id,a);

            }
            return true;
        }
        else
        {
            return false;
        }


    }


    public String name(int id)
    {
        if(this.contas.containsKey(id))
        {
            return contas.get(id).getName();
        }
        else
        {
            return null;
        }
    }


    public String cc(int id)
    {
        if(this.contas.containsKey(id))
        {
            return contas.get(id).getCc();
        }
        else
        {
            return null;
        }
    }


    public int totalBalance()
    {
        int accumulator=0;

        for(Conta a:contas.values())
        {
            accumulator+=a.getBalance();
        }

        return accumulator;
    }


}
