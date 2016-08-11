package org.noob.imooc.socket;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by FujiRen on 2016/8/11.
 */
public class InetAddressDemo {
    public static void main(String[] args) {
        inetAddressDemo();
    }


    public static void inetAddressDemo() {
        try {
//            InetAddress localHost = InetAddress.getLocalHost();
//            InetAddress localHost = InetAddress.getByName("QF-FUJIREN-01");
            InetAddress localHost = InetAddress.getByName("172.16.35.112");

            System.out.println(localHost.getAddress());
            System.out.println(localHost.getHostAddress());
            System.out.println(localHost.getHostName());
            byte[] bytes=localHost.getAddress();
            System.out.println(Arrays.toString(bytes));
            System.out.println(localHost);

        } catch (UnknownHostException e) {
            e.printStackTrace();
    }
    }
}
