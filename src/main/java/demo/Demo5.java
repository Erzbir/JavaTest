package demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

class Demo5 {

}


class Test01 {
    public static void main(String[] args) {
        while (true) {
            try (DatagramSocket socket = new DatagramSocket(12345)) {
                byte[] buf = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buf, 0, buf.length, new InetSocketAddress("192.168.10.39", 12345));

                System.out.println("正在等待客户端发送数据...");
                // 接受由其他UDP传输过来的数据
                socket.receive(packet);
                System.out.println("接收到数据了");
                String data = new String(packet.getData(), 0, packet.getLength(), "GBK");
                System.out.println(packet.getAddress());
                System.out.println(packet.getAddress().getHostAddress());
                System.out.println(packet.getAddress().getHostName());
                System.out.println(packet.getPort());
                System.out.println();
                System.out.println(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Test02 {
    public static void main(String[] args) {
        try (DatagramSocket datagramSocket = new DatagramSocket(11111)) {
            String msg = "你好啊, socket对象";
            byte[] bytes = msg.getBytes("GBK");

            // 数据根对象
            DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress("192.168.10.39", 12345));

            // 发送数据
            datagramSocket.send(packet);
            System.out.println("数据发送完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}