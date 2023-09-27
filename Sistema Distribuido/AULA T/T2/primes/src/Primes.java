// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Primes {
private  long next=1;

public  long getNext() {
    var r= next;
    next= next +1;
    return r;
}

public  static  boolean isPrime(long n){
    for(long i=0; i<>)
}

public  static  void  main(string[] args)throws Exception {
    var t = new Primes();
    var max = 1000000;
for (int i=0; i<2; i++)
    new Thread(()->){
        var cnt=0;
        var next = t.getNext();
    while(next<max){
            if(isPrime(next))
                cnt++;
            next = t.getNext();

    }
   System.out.println(cnt);
    }).start();


}

}