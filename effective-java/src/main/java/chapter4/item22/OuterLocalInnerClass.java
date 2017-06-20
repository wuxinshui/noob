package chapter4.item22;

/**
 * <p>OuterStaticInnerClass</p>
 *
 * @author wuxinshui
 */
public class OuterLocalInnerClass {
    private int age;//年龄
    private String name;//名字

    //j静态成员类
    private InnerCLass1 innerCLass1;
    //非静态成员类
    private InnerCLass2 innerCLass2;

    static class InnerCLass1 {
        private int grade;//年级
        private String className;//班级名称
    }

    class InnerCLass2 {
        private int grade;//年级
        private String className;//班级名称
    }

    //局部类
    public void InnerMethod() {
        class InnerCLass3 {
            private int grade;//年级
            private String className;//班级名称
        }
    }

    public static void main(String[] args) {
        OuterLocalInnerClass outerClass=new OuterLocalInnerClass();
    }

}
