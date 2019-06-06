package com;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by qixin on 2018/1/11.
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);

        ExecutorService executorService = Executors.newCachedThreadPool();

        while (true) {
            Socket socket = serverSocket.accept();

            executorService.execute(() -> {
                try {
                    handle(socket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    private static void handle(Socket socket) throws IOException {
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];

        while (true) {
            int read = inputStream.read(bytes);
            if(read != -1) {
                System.out.println(new String(bytes, 0, read));
            } else {
                break;
            }
        }
    }
}
