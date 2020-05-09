package string;

public class String2Long {
    public static void main(String[] args) {
        String code = "1000001000161060";
        System.out.println(code.replaceFirst("1", "0"));
        System.out.println(code.replaceFirst("0", ""));
        String number = code.replaceFirst("1", "0");
        System.out.println(Long.parseLong(number));
    }
}
