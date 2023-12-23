import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class ServidorConcorrente {
    public static void main(String[] args) throws IOException {



        ServerSocket sSock = new ServerSocket(12345);
        while (true)
        {
            Socket clSock = sSock.accept();

            Thread worker= new Thread ( new ServerWorker(clSock));
            worker.start();

        }
    }
}


class ServerWorker implements Runnable {

    Socket socket;

    ServerWorker(Socket socket) {
        this.socket = socket;
    }



public void run(){
    int soma=0;
    int nums=0;

    try {
        BufferedReader in=null;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream());

        String line = "";
        while ((line = in.readLine()) != null) {
            soma += Integer.parseInt(line);
            nums++;
            out.println(soma);
            out.flush();
        }
        if (nums < 1) {
            nums = 1;
        }
        out.println(soma / nums);
        out.flush();

        socket.shutdownOutput();
        socket.shutdownInput();
        socket.close();
    }catch (IOException e) {
        throw new RuntimeException(e);
    }

}
}


