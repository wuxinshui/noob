package org.noob.imooc.socket.chapter2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by FujiRen on 2016/8/11.
 */
public class getResourceByURL {
    public static void main(String[] args) {
        getResources();
    }

    public static void getResources() {
        try {
            URL url = new URL("http://www.baidu.com");
            InputStream inputStream = url.openStream();
            InputStreamReader reader = new InputStreamReader(inputStream,"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            while (null != line) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            inputStream.close();
            reader.close();
            bufferedReader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
