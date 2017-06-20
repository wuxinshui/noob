package chapter4.item22;

/**
 * <p>OuterInnerTest</p>
 *
 * @author wuxinshui
 */
public class OuterInnerTest {
    public static void main(String[] args) {
        outerStaticInnerClassTest();
    }

    /**
     * 静态成员类
     */
    public static void outerStaticInnerClassTest() {
        OuterStaticInnerClass outerStaticInnerClass = new OuterStaticInnerClass();
        //静态成员类实例化
        OuterStaticInnerClass.PublicInnerCLass publisInnerCLass = new OuterStaticInnerClass.PublicInnerCLass(18, "lis");
        //chapter4.item22.OuterStaticInnerClass.PrivateInnerCLass' has private access in 'chapter4.item22.OuterStaticInnerClass
        //如果静态成员类是私有的，只能在外围类的内部才能访问
        //OuterStaticInnerClass.PrivateInnerCLass privateInnerCLass=new OuterStaticInnerClass.PrivateInnerCLass();

        //
        System.out.println(publisInnerCLass.print());
    }
}
