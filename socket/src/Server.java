import java.io.*;
import java.net.*;
import java.util.logging.Logger;

public class Server {
    public static Logger log = Logger.getLogger(Server.class.getName());
    public static void main(String args[]) {
        try {

            ServerSocket serverSocket = new ServerSocket(8080); // Create a server socket on port 8080
            log.info("Server started. Listening for incoming connections...");

            /* Accept incoming connections */
            Socket clientSocket = serverSocket.accept();
            log.info("Client connected: " + clientSocket.getInetAddress());

            /* Read data from the client */
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = in.readLine();
            log.info("Received message from client: " + message);

            /* Close the connections */
            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}