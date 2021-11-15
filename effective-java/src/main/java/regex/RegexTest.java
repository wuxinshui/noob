package regex;

import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        // String exp = "\\w+(?=0)";
        // Pattern pattern = Pattern.compile(exp);
        // System.out.println(pattern.matcher("1000000021329237").toMatchResult());
        // ;

        // String regexDot = "(?<=\\d+)0";
        String regexDot = "(0)+";
        String str = "1000000021329237";
        str=str.substring(1);

        // String rs = str.replaceFirst(regexDot, "");
        System.out.println(str);
        System.out.println(Long.valueOf(str));
    }
}
