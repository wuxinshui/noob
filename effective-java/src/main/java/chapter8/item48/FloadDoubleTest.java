package chapter8.item48;

import java.math.BigDecimal;

/**
 * <p>FloadDoubleTest</p>
 * fload 和double 主要是为了科学计算和工程计算而设计的。
 * float和double类型，尤其不适合用于货币计算
 * 应使用BigDecimal,int,long进行货币计算
 * 数值范围没有超过9位十进制数字，可以使用int;不超过18位数字，可以使用long;超过18位必须使用BigDecimal
 *
 * @author wuxinshui
 */
public class FloadDoubleTest {
    public static void main(String[] args) {
        floadDoubleTest();
        bigDecimalTest();
        bigDecimalStrTest();
        bigDecimalIntTest();
    }

    /**
     * fload 和double 主要是为了科学计算和工程计算而设计的。
     * float和double类型，尤其不适合用于货币计算
     * 应使用BigDecimal,int,long进行货币计算
     * <p>
     * 3 items bought
     * Change:$0.3999999999999999
     */
    private static void floadDoubleTest() {
        System.out.println(1.02 - .42);//0.6000000000000001
        System.out.println(1.0 - 9 * .10);//0.09999999999999998

        double funds = 1.0;
        int itmesBought = 0;
        for (double price = .10; funds >= price; price += .10) {
            funds -= price;
            itmesBought++;
        }

        System.out.println(itmesBought + " items bought");
        System.out.println("Change:$" + funds);
    }

    /**
     * 3 items bought
     * Change:$0.3999999999999999666933092612453037872910499572753906250
     */
    private static void bigDecimalTest() {

        BigDecimal funds = new BigDecimal(1.0);
        int itmesBought = 0;
        for (BigDecimal price = new BigDecimal(.10); funds.compareTo(price) >= 0; price = price.add(new BigDecimal(.10))) {
            funds = funds.subtract(price);
            itmesBought++;
        }

        System.out.println(itmesBought + " items bought");
        System.out.println("Change:$" + funds);
    }

    /**
     * 4 items bought
     * Change:$0.00
     */
    private static void bigDecimalStrTest() {

        BigDecimal funds = new BigDecimal("1.0");
        int itmesBought = 0;
        for (BigDecimal price = new BigDecimal(".10"); funds.compareTo(price) >= 0; price = price.add(new BigDecimal(".10"))) {
            funds = funds.subtract(price);
            itmesBought++;
        }

        System.out.println(itmesBought + " items bought");
        System.out.println("Change:$" + funds);
    }

    /**
     * 4 items bought
     * Change:$0
     */
    private static void bigDecimalIntTest() {

        int funds = 100;
        int itmesBought = 0;
        for (int price = 10; funds >= price; price += 10) {
            funds -= price;
            itmesBought++;
        }

        System.out.println(itmesBought + " items bought");
        System.out.println("Change:$" + funds);
    }
}
