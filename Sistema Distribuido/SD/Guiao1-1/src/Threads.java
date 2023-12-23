
    public class Threads {

        public static void main(String args[]){

            final int N=10;

            Thread [] threads=new Thread[N];

            for(int i=0;i<N;i++)
            {
                threads [i]=new Thread(new Increment());
            }

            for(int i=0;i<N;i++)
            {
               threads[i].start();
            }

            for(int i=0;i<N;i++)
            {
                try{
                    threads [i].join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }


            }

        }

}