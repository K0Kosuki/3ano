package g8;

import java.io.*;
import java.net.Socket;
import java.util.concurrent.locks.ReentrantLock;

public class FramedConnection implements AutoCloseable {

    private Socket socket;
    private ReentrantLock wlock;
    private ReentrantLock rlock;

    private DataInputStream in;
    private DataOutputStream out;
    public FramedConnection(Socket socket) throws IOException {

        this.socket=socket;
        this.wlock=new ReentrantLock();
        this.rlock=new ReentrantLock();

        in= new DataInputStream(new BufferedInputStream(this.socket.getInputStream()));
        out = new DataOutputStream((new BufferedOutputStream(this.socket.getOutputStream())));

    }

    public void send(byte[] data) throws IOException {

        wlock.lock();
        try{
            this.out.writeInt(data.length);
            this.out.write(data);
            this.out.flush();
        }finally{
            wlock.unlock();
        }


    }

    public byte[] receive() throws IOException {
        rlock.lock();
        try{
            byte[] msg=new byte[this.in.readInt()];
            this.in.readFully(msg);

            return msg;
        }finally{
            rlock.unlock();
        }
    }



    public void close() throws IOException {

        rlock.lock();
        this.in.close();
        wlock.lock();
        this.out.close();
        rlock.unlock();
        wlock.unlock();
        this.socket.close();
    }


}
