import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int port = 8000;
        String host = "localhost";

        DataInputStream in;
        DataOutputStream out;
        Socket socket;

        try {
//
        socket = new Socket(host, port);
            System.out.println("connected");
        in = new DataInputStream (socket.getInputStream());
        out = new DataOutputStream (socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        scanner.close();
        out.writeDouble(d);
        double area = in.readDouble();
        System.out.println(area);

    }


    catch (Exception e){
        System.out.println(e);
    }
    }
}