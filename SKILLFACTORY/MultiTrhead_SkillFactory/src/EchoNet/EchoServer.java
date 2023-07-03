package EchoNet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws
            IOException {
        // создаём серверный сокет на порту 1234
        ServerSocket server = new ServerSocket(1234);
        while (true) {
            System.out.println("Waiting...");

            // ждём клиента из сети
            Socket socket = server.accept();
            System.out.println("Client connected!");
            // создаём клиента на своей стороне
            Client client = new Client(socket);
            // запускаем поток
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}
