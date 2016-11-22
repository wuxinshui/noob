package org.noob.imooc.socket.chapter3;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 客户端
 */
public class Client1 {
    public static void main(String[] args) {
        try {
            //1.创建客户端Socket,指定服务器地址和端口
            Socket socket = new Socket("localhost", 8888);
            //2.获取输出流，向服务器端发出请求
            OutputStream os = socket.getOutputStream();//字节输出流
            PrintWriter pw = new PrintWriter(os);//将输出流包装为打印流
            pw.write("用户名：admin;密码：123");
            socket.shutdownOutput();//关闭输出流
            //3.关闭资源
            pw.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
