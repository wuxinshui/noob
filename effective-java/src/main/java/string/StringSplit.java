package string;

import java.util.Arrays;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/8/22 11:13
 */
public class StringSplit {
    public static void main(String[] args) {
        String str="";
        String[] array=str.split("/");

        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
    }
}
