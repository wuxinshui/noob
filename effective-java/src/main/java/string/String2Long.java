package string;

public class String2Long {
    public static void main(String[] args) {
        String code = "1000001000000000";
        System.out.println(code.replaceFirst("1", "0"));
        System.out.println(code.replaceFirst("0", ""));
        String number = code.replaceFirst("1", "0");
        System.out.println(Long.parseLong(number));

        String max_code = "100000000000000000";
        String min_code = "123456";

        String md = max_code.substring(0, max_code.length() - min_code.length()).concat(min_code);
        System.out.println(max_code);
        System.out.println(md);
    }
}
