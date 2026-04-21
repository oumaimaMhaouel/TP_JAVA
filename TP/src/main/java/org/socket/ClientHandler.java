package org.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientHandler implements Runnable {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        String clientIP = socket.getInetAddress().getHostAddress();
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread " + threadName + " traite le client " + clientIP);

        try (
                InputStreamReader is = new InputStreamReader(socket.getInputStream());
                BufferedReader br = new BufferedReader(is);
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        ) {
            pw.println("Veuillez saisir votre message:");

            String message;
            String messageReceive;
            while ((message = br.readLine()) != null) {
                System.out.println("Thread : " + threadName);
                System.out.println("Client IP : " + clientIP);
                System.out.println("Message reçu : " + message);

                if (message.equalsIgnoreCase("hello")) {
                    messageReceive = "Bonjour client !";
                } else if (message.equalsIgnoreCase("time")) {
                    messageReceive = LocalDateTime.now()
                            .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
                } else if (message.equalsIgnoreCase("bye")) {
                    pw.println("Connexion fermée");
                    break;
                } else {
                    messageReceive = "Message reçu : [" + message + "]";
                }
                pw.println(messageReceive);
                pw.println("Veuillez saisir votre message:");

                System.out.println("Server :" + messageReceive);

            }
        } catch (IOException e) {
            System.out.println("Client déconnecté");
        } finally {
            try {
                socket.close();
            } catch (IOException ignored) {
            }
        }
    }
}
