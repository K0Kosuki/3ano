import java.util.HashMap;
import java.util.Map;
public class BancoImpl implements Banco{

    private Map<Integer,Integer>  account;

    private  int counter;

    public BancoImpl(){
        account = new HashMap<>();
        counter = 0;
    }

        @Override
        public int open() {
        int id = counter;
        String name;
        int cc;
            account.put(id,0);
            counter++ ;
            return id;
        }
        @Override
       public int balance(int id){
        if(account.containsKey(id))
        {
           return this.account.get(id);
        }
        else
        {
            return 0;
        }
        }

    @Override
    public boolean deposit(int id, int value) {
        boolean ret=false;
    if(account.containsKey(id))
        {
           int saldo = this.account.get(id);
           int total= saldo + value;
           this.account.put(id,total);
         ret =true;
        }

      return ret;

    }

    @Override
    public boolean withdraw(int id, int value) {
       boolean ret=false;
       if(this.account.containsKey(id))
       {
           int balance = this.account.get(id);
           if(balance>=value){
               this.account.put(id,balance - value);

           }
           ret=true;
       }
       else {
           ret=false;
       }
       return ret;
    }

    @Override
    public String name(int id) {
        boolean res=false;
       return  null;
    }

    @Override
    public String cc(int id) {
        return null;
    }


}
