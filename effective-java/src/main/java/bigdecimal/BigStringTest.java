package bigdecimal;

import java.math.BigDecimal;

public class BigStringTest {
    public static void main(String[] args) {
        BigDecimal big=BigDecimal.valueOf(9999999.0);
        System.out.println(big.toString());
        System.out.println(big.toPlainString());
        System.out.println(big.toEngineeringString());
        System.out.println(big.toBigInteger().toString());
        System.out.println(big.toBigIntegerExact().toString());
    }
}
