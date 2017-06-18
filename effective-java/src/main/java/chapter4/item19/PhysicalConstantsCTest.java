package chapter4.item19;

//import static chapter4.item19.PhysicalConstantsC.AVOGADROS_NUMBER;

import static chapter4.item19.PhysicalConstantsC.*;

/**
 * <p>PhysicalConstantsCTest</p>
 * 如果大量利用工具类导出的常量，可以
 * 通过利用静态导入（static import）机制，避免用类名来修饰常量名。
 *
 * @author wuxinshui
 */
//use of static important to avoid qualifying constants
public class PhysicalConstantsCTest {
    public static void main(String[] args) {
        PhysicalConstantsCTest physicalConstantsCTest = new PhysicalConstantsCTest();
        System.out.println(physicalConstantsCTest.atoms(2));
    }

    double atoms(double atoms) {
        return AVOGADROS_NUMBER * atoms;
    }
}
