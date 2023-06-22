package java_lang.java_standard_procedure.Ex16;

import java.io.IOException;
import java.net.*;

public class UdpClient {
    public void start() throws IOException, UnknownHostException{
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

        // 데이터가 저장될 공간으로 byte 배열을 생성합니다.
        byte[] msg = new byte[100];

        DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
        DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

        datagramSocket.send(outPacket);  // Datagram패킷 송신
        datagramSocket.receive(inPacket);  // Datagram패킷 수신

        System.out.println("current server time: " + new String(inPacket.getData()));

        datagramSocket.close();
    } // start()

    public static void main(String[] args) {
        try{
            new UdpClient().start();
        } catch(Exception e) { e.printStackTrace(); }
    }
}
