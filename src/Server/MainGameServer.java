package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MainGameServer {
    private boolean stop = false;
    private ServerSocket serverSocket;
    public MainGameServer(){
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("Server started");
            Socket clientSocket = this.serverSocket.accept();
            System.out.println("Connected client from adress " + clientSocket.getInetAddress().getHostAddress() + ".");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            while (!stop) {
                String temp = in.readLine();
                System.out.println( temp );
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
