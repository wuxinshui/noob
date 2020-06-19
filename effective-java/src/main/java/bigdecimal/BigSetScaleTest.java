package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigSetScaleTest {
    public static void main(String[] args) {
        BigDecimal big = BigDecimal.valueOf(0.786);
        // BigDecimal big = BigDecimal.valueOf(0.8);
        // BigDecimal big = BigDecimal.valueOf(0.79);
        System.out.println(big.setScale(2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(10)));
        System.out.println(big.setScale(2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(10)).doubleValue());
    }
}
