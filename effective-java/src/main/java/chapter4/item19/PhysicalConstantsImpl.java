package chapter4.item19;

/**
 * <p>PhysicalConstantsImpl</p>
 *
 * @author wuxinshui
 */
public class PhysicalConstantsImpl implements PhysicalConstants {

    /**
     * 常量接口模式是对接口的不良使用。类在内部使用某些常量，这纯粹是是实现细节。
     * 实现常量接口会导致把这样的实现细节泄露到该类的导出API中。
     * 接口应该只被用来定义类型，不应该用来导出常量。
     *
     * @param args
     */
    public static void main(String[] args) {
        PhysicalConstants physicalConstants = new PhysicalConstantsImpl();
        PhysicalConstantsImpl physicalConstants1 = new PhysicalConstantsImpl();
        System.out.println(physicalConstants.AVOGADROS_NUMBER);
        System.out.println(physicalConstants1.AVOGADROS_NUMBER);
    }
}
