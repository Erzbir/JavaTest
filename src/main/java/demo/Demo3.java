package demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


class Demo3 {

}


class UDPReceive extends Thread {

    @Override
    public void run() {
        receiveMsg();
    }

    public void receiveMsg() {
        DatagramSocket socket = null;
        while (true) {
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);
            System.out.println("等待数据中");
        }
    }

}

class UDPSend extends Thread {

    @Override
    public void run() {
        sentMsg();
    }

    public void sentMsg() {

    }
}