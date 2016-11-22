package org.noob.imooc.socket.Chapter4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by FujiRen on 2016/8/19.
 */
public class Server {
    public static void main(String[] args) {
        try {
            //1.创建服务器端DatagramSocket,指定端口
            DatagramSocket socket = new DatagramSocket(8899);
            //2.创建数据报，用于接受客户端发生的数据
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            //3.接受客户端发送的数据
            socket.receive(packet);//此方法在接收到数据报之前会一直阻塞
            //4.读取数据
            String info = new String(data, 0, packet.getLength());
            System.out.println("This is Server,client say: " + info);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
