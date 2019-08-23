package string;

import java.util.Arrays;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/8/23 14:48
 */
public class CodePointTest {
    public static void main(String[] args) {

        int codepoint[] = new int[]{167988,65,168177,66,168169,167951,
                67,168310,168405,168548,68,168688};
        String str = new String(codepoint,0,codepoint.length);
        System.out.println(str);
        System.out.println("codePoints:"+Arrays.toString(str.codePoints().toArray()));
        System.out.println("chars:"+Arrays.toString(str.chars().toArray()));
        System.out.println("1 : "+str.codePointAt(0));
        System.out.println("2 : "+str.codePointAt(1));
        System.out.println("3 : "+str.codePointAt(2));
        System.out.println("4 : "+str.codePointBefore(3));
        System.out.println("5 : "+str.codePointBefore(4));
        System.out.println("6 : "+str.codePointBefore(5));
        System.out.println("7 : "+str.codePointCount(0, str.length()));
        System.out.println("8 : "+str.codePointCount(4, str.length()));
        System.out.println("9 : "+str.offsetByCodePoints(0, 4));
        System.out.println("10 : "+str.offsetByCodePoints(0, 5));
    }
}
