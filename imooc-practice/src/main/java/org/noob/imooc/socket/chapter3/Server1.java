package org.noob.imooc.socket.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 基于TCP协议的SOCKET通信，实现用户登录
 * 服务器端
 */
public class Server1 {
    public static void main(String[] args) {
        try {
            //1.创建一个服务器端sokcet,即ServerSocket,指定绑定的端口，并监听此端口
            ServerSocket serverSocket = new ServerSocket(8888);
            //2.调用accept方法开始监听，等待客户端的链接
            Socket socket = serverSocket.accept();
            //3.获取输入流，并读取客户端信息
            InputStream is = socket.getInputStream();//字节输入流
            InputStreamReader isr = new InputStreamReader(is);//将字节输入流转换为字符流
            BufferedReader br = new BufferedReader(isr);//为输入流添加缓冲
            String info = null;
            while (null != (info = br.readLine())) {//循环读取客户端的信息
                System.out.println("Server1,CLient say:" + info);
            }
            socket.shutdownInput();//关闭输入流
            //4.关闭资源
            br.close();
            isr.close();
            is.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
