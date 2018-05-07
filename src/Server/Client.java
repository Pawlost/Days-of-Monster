package Server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private Socket clientSocket;
    private Scanner in;

    public Client() {
        try {
            this.clientSocket = new Socket("localhost", 8080 );
            System.out.println("Spuštění klienta proběhlo úspěšně.");
            this.in = new Scanner( System.in );

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter( this.clientSocket.getOutputStream()));
            String temp = in.nextLine(); // proměnná pro ukládání zpráv uživatele
            out.write(temp + "\r\n"); // zapsání zprávy do BufferedWriteru
            out.flush(); // odeslání zprávy
            System.out.println("Zpráva: \"" + temp + "\" byla odeslána."); // oznámení o úspěšném odeslání

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
