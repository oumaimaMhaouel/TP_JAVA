package org.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadServer {
    public static void main(String[] args) throws IOException {
    ServerSocket serverSocket=new ServerSocket(5000);
        System.out.println("Serveur démarré sur le port " + 5000);
     ExecutorService executorService= Executors.newFixedThreadPool(5);
        while (true) {
            Socket clientSocket = serverSocket.accept();
            String clientIP = clientSocket.getInetAddress().getHostAddress();
            System.out.println("Nouvelle connexion de : " + clientIP);
            executorService.submit(new ClientHandler(clientSocket));
        }
    }
}
