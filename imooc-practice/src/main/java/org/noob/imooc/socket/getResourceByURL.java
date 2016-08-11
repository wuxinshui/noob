package org.noob.imooc.socket;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by FujiRen on 2016/8/11.
 */
public class getResourceByURL {
    public static void main(String[] args){

    }

    public static void getResources(){
        try {
            URL url=new URL("http://www.baidu.com");
            InputStream inputStream=url.openStream();
            InputStreamReader reader=new InputStreamReader(inputStream);
            BufferedReader bufferedReader=new BufferedReader(reader);
            String line=bufferedReader.readLine();
            while (null!=line){

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
