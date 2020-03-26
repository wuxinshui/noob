package string;

import org.springframework.util.StringUtils;

import java.util.Arrays;

public class SpringBootStringUtilsTest {
    public static void main(String[] args) {
        splitTest();
        delimitedListToStringArrayTest();
    }

    public static void splitTest() {
        // String str = "330200,330300,331000,330700,330100,330600,330500,330400,320500,320200,320600,320400,320100,320300,320800,321100,320900";
        // String str = "";
        String str = "330200";
        String[] array = StringUtils.split(str, ",");
        System.out.println(Arrays.toString(array));
    }

    public static void delimitedListToStringArrayTest() {
        // String str = "330200,330300,331000,330700,330100,330600,330500,330400,320500,320200,320600,320400,320100,320300,320800,321100,320900";
        // String str = "";
        String str = "330200";

        String[] array = StringUtils.delimitedListToStringArray(str, ",");
        System.out.println(Arrays.toString(array));
    }
}
