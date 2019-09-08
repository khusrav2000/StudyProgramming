import com.sun.istack.internal.Nullable;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8000)){
            System.out.println("Server started!");
            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    System.out.println("Client connect!");
                    BufferedWriter writer =
                            new BufferedWriter(
                                    new OutputStreamWriter(
                                            socket.getOutputStream()));
                    BufferedReader reader =
                            new BufferedReader(
                                    new InputStreamReader(
                                            socket.getInputStream()));
                    String request = reader.readLine();
                    String response = "NULL";
                    try {
                        response = "Length of the String is:" + request.length() + " - You String is:" + request;
                    }catch (NullPointerException e){
                        e.printStackTrace();
                    }

                    writer.write(response);
                    System.out.println(response);
                    writer.newLine();
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
