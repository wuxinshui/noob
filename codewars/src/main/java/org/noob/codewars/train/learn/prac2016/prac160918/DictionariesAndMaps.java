package org.noob.codewars.train.learn.prac2016.prac160918;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by FujiRen on 2016/9/18.
 */
public class DictionariesAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map phoneNumbers=new HashMap();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneNumbers.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneNumbers.containsKey(s)){
                System.out.println(s+"="+phoneNumbers.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
