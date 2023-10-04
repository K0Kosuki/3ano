class Increment implements Runnable {
    public void run() {
        final long I = 100;
        for(long i=0; i<I ;i++)
        {
            System.out.println("processo = " + i);
        }
    }
}

public class CounterExample {
    public static void main(String[] args){
        final int N = 10;
        Thread [] threads = new Thread[N];

        for(int i=0;i<N;i++){
            threads[i] = new Thread(new Increment());
        }

        for (int i=0;i<N;i++)
        {
            threads[i].start();
        }

        for(int i = 0;i<N;i++){
            try {
                threads[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
