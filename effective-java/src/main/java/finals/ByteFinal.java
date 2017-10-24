package finals;

/**
 * <p>ByteFinal</p>
 *
 * @author wuxinshui
 */
public class ByteFinal {
    public static void main(String[] args) {
        //此例中若没有final便会报错，因为如果去掉final，bt1和bt2在运算时JVM将其自动转换为了int类型变量，最后相当于将一个int类型赋值给了一个byte类型。
        final byte bt1 = 1;
        final byte bt2 = 2;
        byte bt3 = bt1 + bt2;
        System.out.println(bt3);
    }
}
