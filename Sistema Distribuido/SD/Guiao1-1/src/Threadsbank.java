public class Threadsbank {

    final int T=10;

    final int D=1000;

    final int V=100;

    Thread[] threads=new Thread[T];

    for(int i=0;i<T; i++)
    {
        Threads[i]=new Thread(new Bank());
    }
}
