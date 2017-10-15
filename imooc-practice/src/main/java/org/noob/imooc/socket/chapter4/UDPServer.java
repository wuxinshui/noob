package org.noob.imooc.socket.chapter4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by FujiRen on 2016/8/19.
 */
public class UDPServer {
    public static void main(String[] args) {
        try {
            /**
             * 接受客户端信息
             */
            //1.创建服务器端DatagramSocket,指定端口
            DatagramSocket socket = new DatagramSocket(8800);
            //2.创建数据报，用于接受客户端发生的数据
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            System.out.println("Server is starting---------");
            //3.接受客户端发送的数据
            socket.receive(packet);//此方法在接收到数据报之前会一直阻塞
            //4.读取数据
            String info = new String(data, 0, packet.getLength());
            System.out.println("This is Server,client say: " + info);
            /**
             * 响应客户端，向客户端发送消息
             */

            byte[] resposneInfo="Hello Iam Server".getBytes();
            InetAddress address=packet.getAddress();
            int port=packet.getPort();
            DatagramPacket packet1=new DatagramPacket(resposneInfo,resposneInfo.length,address,port);
            socket.send(packet1);

            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
