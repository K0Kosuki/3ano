import java.io.*;
import java.net.Socket;
import java.util.*;

class Contact {
    private String name;
    private int age;
    private long phoneNumber;
    private String company;     // Pode ser null
    private ArrayList<String> emails;

    public Contact(String name, int age, long phoneNumber, String company, List<String> emails) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.emails = new ArrayList<>(emails);
    }

    public String name() { return name; }
    public int age() { return age; }
    public long phoneNumber() { return phoneNumber; }
    public String company() { return company; }
    public List<String> emails() { return new ArrayList(emails); }



    static Socket s= null;


    // @TODO ex1
    public void serialize(DataOutputStream out) throws IOException {
        out=new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));

        out.writeUTF(this.name);
        out.writeInt(this.age);
        out.writeLong(this.phoneNumber);

       if (this.company==null) {
           out.writeBoolean(false);
       }
       else {
           out.writeBoolean(false);
           out.writeUTF(this.company);
       }

        out.writeUTF(String.valueOf(emails));

        out.flush();


    }

    // @TODO ex1
    public static Contact deserialize(DataInputStream in) throws IOException {

        in=new DataInputStream(new BufferedInputStream(s.getInputStream()));

        String name=in.readUTF();
        int age=in.readInt();
        long phoneNumber= in.readLong();

        return new Contact(in.readUTF(),in.readUTF());

    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name).append(";");
        builder.append(this.age).append(";");
        builder.append(this.phoneNumber).append(";");
        builder.append(this.company).append(";");
        builder.append(this.emails.toString());
        builder.append("}");
        return builder.toString();
    }

}
