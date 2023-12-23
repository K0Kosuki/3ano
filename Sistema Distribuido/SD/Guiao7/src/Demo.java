import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Demo {
    public static void main(String[] args) throws Exception
    {
        // escrever para um socket
        Socket s= null;

        // var os= new DataOutputStream(s.getOutputStream());   ERRADO
        var os= new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));

        os.writeInt(123);
        os.writeUTF("ola");
        os.flush();


        // ler de um socket
       // var os= new DataOutputStream(s.getOutputStream())  INEFICIENTE
        var is= new DataInputStream(new BufferedInputStream(s.getInputStream()));

        is.readInt();
        is.readUTF();
    }
}
