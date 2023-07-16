import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int port = 8000;
        DataInputStream in;
        DataOutputStream out;
        ServerSocket server;
        Socket socket;
        double aNumber = 45;


        try {
            server = new ServerSocket(port);
            socket = server.accept();
            System.out.println("connected");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            double radius = in.readDouble();
            double Area = radius*radius*Math.PI;
            System.out.println();
            out.writeDouble(Area);
            InetAddress address = InetAddress.getByName("I");
            InetAddress addres = socket.getInetAddress();
            System.out.println(addres.getHostAddress());
            System.out.println(addres.getCanonicalHostName());
            System.out.println(address.getHostAddress());


        }catch (Exception e){
          e.getStackTrace();
        }






    }
}