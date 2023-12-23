package g8;

import java.io.*;
import java.net.Socket;
import java.util.concurrent.locks.ReentrantLock;

public class TaggedConnection implements AutoCloseable{
    public static class Frame {
        public final int tag;
        public final byte[] data;

        public Frame(int tag, byte[] data) {
            this.tag = tag;
            this.data = data;
        }
    }

    private Socket socket;
    private ReentrantLock wlock;
    private ReentrantLock rlock;

    private DataInputStream in;
    private DataOutputStream out;

    public TaggedConnection(Socket socket) throws IOException {

        this.socket=socket;
        this.wlock=new ReentrantLock();
        this.rlock=new ReentrantLock();

        in= new DataInputStream(new BufferedInputStream(this.socket.getInputStream()));
        out = new DataOutputStream((new BufferedOutputStream(this.socket.getOutputStream())));

    }

    public void send(Frame frame) throws IOException {

        this.send(frame);
    }


    public void send(int tag, byte[] data) throws IOException {

        this.wlock.lock();
        try{

            this.out.writeInt(tag);
            this.out.writeInt(data.length);
            this.out.write(data);
            this.out.flush();
        }finally{
            this.wlock.unlock();
        }
    }

    public Frame receive() throws IOException {

        this.rlock.lock();
        try
        {
            int tag = this.in.readInt();

            byte[] msg = new byte[this.in.readInt()];

            this.in.readFully(msg);

            return new Frame(tag, msg);
        }finally{
            this.rlock.unlock();
        }


    }

    public void close() throws IOException {

        this.socket.close();
    }



}
