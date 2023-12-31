import java.net.*;
import java.io.*;
class Cliente {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream());

        BufferedReader systemIn=new BufferedReader(new InputStreamReader(System.in));

        String line="";
        String server_reply="";

        while ((line=systemIn.readLine())!=null) {
            out.println(line);
            out.flush();
            server_reply=in.readLine();

            if(server_reply!=null)
            {
                System.out.println("Servidor respondeu com "+server_reply);
            }
        }

        socket.shutdownOutput();
        System.out.println("Servidor responde com média "+in.readLine());
        socket.shutdownInput();

    }
}
