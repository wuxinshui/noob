package chapter4.item22;

/**
 * <p>OuterStaticInnerClass</p>
 *
 * @author wuxinshui
 */
public class OuterLocalInnerClass {
    private String teacher;//老师
    private static int grade;//年级
    private static String className;//班级名称

    public OuterLocalInnerClass() {
        this.grade = 1;
        this.className = "高三";
        this.teacher = "王莉";
    }

    //局部类
    public void InnerMethod() {
       class InnerCLass3 {
            private int age;//年龄
            private String name;//名字

            public InnerCLass3(int age, String name) {
                this.age = age;
                this.name = name;
            }
        }
    }

    public static void main(String[] args) {
        OuterLocalInnerClass outerClass=new OuterLocalInnerClass();
//        outerClass.new InnerCLass3(18, "lis");
    }

}
