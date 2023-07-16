import org.apache.xmlrpc.WebServer;

        public class Main {
            public static void main(String[] args) {
                WebServer ws = new WebServer(1999);
                ws.addHandler("serverRPC", new Crud());
                ws.start();
                System.out.println("Server RPC started");

            }
        }


