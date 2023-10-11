import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private static class Account {
        private int balance;
        Account(int balance) {
            this.balance = balance;

        }
        int balance() { return balance; }
        boolean deposit(int value) {
            balance += value;
            return true;
        }
        boolean withdraw(int value) {
            if (value > balance)
                return false;
            balance -= value;
            return true;
        }
    }

    // Bank slots and vector of accounts
    private int slots;
    private ReentrantLock l;
    private Account[] av;

    public Bank(int n) {
        this.l = new ReentrantLock();
        slots=n;
        av=new Account[slots];
        for (int i=0; i<slots; i++) av[i]=new Account(0);
    }

    // Account balance
    public int balance(int id) {
        l.lock();
        try {
            if (id < 0 || id >= slots)
                return 0;
            return av[id].balance();
        }
        finally {
            l.unlock();
        }
    }

    // Deposit
    public boolean deposit(int id, int value) {
        if (id < 0 || id >= slots)
            return false;
        l.lock();
        try{

            return av[id].deposit(value);
        }
        finally {
            l.unlock();
        }
    }

    // Withdraw; fails if no such account or insufficient balance
    public boolean withdraw(int id, int value) {
       l.lock();
        if (id < 0 || id >= slots)
            return false;
       try {
           return av[id].withdraw(value);
       }finally {
           l.unlock();
       }
    }

    public boolean transfer (int from, int to, int value)
    {
        l.lock();
        try {
            return withdraw(from,value) && deposit(to,value);
        }
        finally
        {
            l.unlock();
        }

    }

    public int totalBalance()
    {
        int res=0;
        l.lock();
        try {
            for (Account a : av)
            {
                res += a.balance;
            }
            return res;
        }
        finally {
            l.unlock();
        }
    }
}