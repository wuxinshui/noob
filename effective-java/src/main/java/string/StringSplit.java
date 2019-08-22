package string;

import java.util.Arrays;

/**
 * Connected to the target VM, address: '127.0.0.1:61351', transport: 'socket'
 * [1, 2, 3]
 * 3
 * Disconnected from the target VM, address: '127.0.0.1:61351', transport: 'socket'
 * [1, 2,3]
 * 2
 *
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/8/22 11:13
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "1,2,3";
        String[] array = str.split(",");
        String[] limit = str.split(",", 2);

        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        System.out.println(Arrays.toString(limit));
        System.out.println(limit.length);
    }
}
