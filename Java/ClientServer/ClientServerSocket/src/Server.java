import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Server started!");

        Socket socket = serverSocket.accept();
        System.out.println("Client connect!");

        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter streamWriter = new OutputStreamWriter(outputStream);
        streamWriter.write("Hello From Server!");
        //streamWriter.flush();
        streamWriter.close();
        socket.close();
        serverSocket.close();
    }
}
