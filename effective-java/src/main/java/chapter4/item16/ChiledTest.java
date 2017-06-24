package chapter4.item16;

/**
 * <p>ChiledTest</p>
 *
 * @author wuxinshui
 */
public class ChiledTest extends ParentTest {
    // 3.超类新增了新的方法，仅方法的返回类型和子类中持有的方法不一样，会导致子类无法通过编译。
    // public String print3() {
    //     System.out.println("This is print3 test");
    //     return "print3";
    // }
}
