
import org.apache.xmlrpc.XmlRpcClient;
import org.apache.xmlrpc.XmlRpcException;
//import org.apache.xmlrpc.XmlRpcException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Vector;

class Client {
    Vector<String> vector = null;
    XmlRpcClient client = null;
    String serverUrl = null;
    static String userId;

    public Client() throws MalformedURLException {
        serverUrl = "http://192.1.1.1:1999/RPC2";
        client = new XmlRpcClient(serverUrl);
        vector = new Vector<String>();
    }

    Vector<String> showData() {
        Vector<String> data = new Vector<>();
        try {
            client.getURL();
            data = (Vector<String>) client.execute("serverRPC.getData", vector);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (XmlRpcException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    String insertData(String username, String password) {
        String status = "";
        userId = username;
        vector.add(username);
        vector.add(password);
        try {
            status = (String) client.execute("serverRPC.insertData", vector);
            vector = new Vector<>();
        } catch (XmlRpcException | IOException e) {
            throw new RuntimeException(e);
        }
        return status;
    }

    void insertMessage(String text) throws XmlRpcException, IOException {
        String status = "";
        vector.add(userId);
        vector.add(text);

            status = (String) client.execute("serverRPC.insertMessage", vector);


        vector = new Vector<>();
        System.out.println(status);
    }
}
