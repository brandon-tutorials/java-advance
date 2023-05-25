import java.io.*;
import java.net.*;
import java.util.logging.Logger;

public class Client {
    public static Logger log = Logger.getLogger(Server.class.getName());
    public static void main(String args[]) {
        try {
            Socket socket = new Socket("localhost", 8080);
            log.info("Connected to server: " + socket.getInetAddress());

            /* Send data to the server*/
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            log.info("Hello, server!");

            /* Close the connection */
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}