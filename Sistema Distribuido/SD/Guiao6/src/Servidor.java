
import java.net.*;
import java.io.*;

public class Servidor {

    public static void main(String[] args) throws IOException{



    ServerSocket sSock = new ServerSocket(12345);
    while (true)
    {
        int soma=0;
        int nums=0;
        Socket clSock = sSock.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(clSock.getInputStream()));
        PrintWriter out = new PrintWriter(clSock.getOutputStream());

        String line="";
        while((line=in.readLine())!=null) {
            soma+=Integer.parseInt(line);
            nums++;
            out.println(soma);
            out.flush();
    }
        if(nums<1){
            nums=1;
        }
        out.println(soma/nums);
        out.flush();

    }
}

}
