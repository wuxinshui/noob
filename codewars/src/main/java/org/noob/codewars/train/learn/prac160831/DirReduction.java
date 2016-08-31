package org.noob.codewars.train.learn.prac160831;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by FujiRen on 2016/8/31.
 */
public class DirReduction {
    public static void main(String[] args) {
        String[] arr = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(dirReduc(arr)));
    }


    public static String[] dirReduc(String[] arr) {
        // Your code here.
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, arr);
        arrayList=handle(arrayList);
        String[] array=new String[arrayList.size()];
        for (int i=0;i<arrayList.size();i++) {
            array[i]=arrayList.get(i);
        }
        return array;
    }

    private static ArrayList<String>  handle(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            String s = arrayList.get(i) + arrayList.get(i + 1);
            if (s.equals("NORTHSOUTH")) {
                arrayList.remove(i);
                arrayList.remove(i);
                handle(arrayList);

            }
            if (s.equals("SOUTHNORTH")) {
                arrayList.remove(i);
                arrayList.remove(i);
                handle(arrayList);

            }
            if (s.equals("EASTWEST")) {
                arrayList.remove(i);
                arrayList.remove(i);
                handle(arrayList);

            }
            if (s.equals("WESTEAST")) {
                arrayList.remove(i);
                arrayList.remove(i);
                handle(arrayList);
            }
        }
        return arrayList;
    }


}
