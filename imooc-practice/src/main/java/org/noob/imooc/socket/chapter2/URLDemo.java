package org.noob.imooc.socket.chapter2;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by FujiRen on 2016/8/11.
 */
public class URLDemo {
    public static void main(String[] args) {
        urlDemo();
    }

    public static void urlDemo() {
        try {
            URL imooc = new URL("http://www.imooc.com");
            URL url=new URL(imooc,"/index.html?username=tom#test1");
            System.out.println(imooc);
            System.out.println(url);
            System.out.println("协议："+url.getProtocol());
            System.out.println("path："+url.getPath());
            System.out.println("主机："+url.getHost());
            System.out.println("端口："+url.getPort());
            System.out.println("默认端口："+url.getDefaultPort());
            System.out.println("文件名："+url.getFile());
            System.out.println("相对路径："+url.getRef());
            System.out.println("用户信息："+url.getUserInfo());
            System.out.println("查询字符串："+url.getQuery());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
