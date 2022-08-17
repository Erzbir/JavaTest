package demo;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

class Test05 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(12548);
            while (true) {
                System.out.println("服务器开始运行了, 等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println(Arrays.toString(socket.getInetAddress().getAddress()));
                System.out.println(socket.getLocalAddress());
                System.out.println(socket.getLocalPort());

                // 推送一条消息
                String msg = "你好";
                OutputStream os = socket.getOutputStream();
                PrintWriter out = new PrintWriter(os, true);
                out.println(msg);
                os.close();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}