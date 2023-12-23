
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.Arrays.asList;

class ContactManager {
    private HashMap<String, Contact> contacts = new HashMap<>();

    private ReentrantLock lock;

    public ContactManager manager;
    // @TODO
    public void update(Contact c) {
        lock.lock();
        try{
            contacts.put(c.name(),c);
        }
        finally {
            lock.unlock();
        }
    }



    // @TODO
    public ContactList getContacts() {

        lock.lock();

        try {
            ContactList cl = new ContactList();

            for (Contact c : contacts.values()) {
                cl.add(c);
            }
            return cl;
        } finally {
            lock.unlock();
        }
    }
}

class ServerWorker implements Runnable {
    private Socket socket;
    private ContactManager manager;

    public ServerWorker(Socket socket, ContactManager manager) {
        this.socket = socket;
        this.manager = manager;
    }

    // @TODO  ex2
    @Override
    public void run() {
        try{
            DataInputStream in=new DataInputStream(new BufferedInputStream(this.socket.getInputStream()));
            DataOutputStream out= new DataOutputStream(BufferedOutputStream(this.socket.getOutputStream()));
            ContactList cl=this.manager.getContacts();
            cl.serialize(out);
            out.flush();

            boolean open=true;

            while(open)
            {
                Contact contact=Contact.deserialize(in);

                if(contact==null)
                {
                    open=false;
                }
                manager.update(contact);
            }
            socket.close();
        }
        catch (IOException e)
        {
            System.out.println("Connection closed....");
        }

    }



public class ServerList {

}
