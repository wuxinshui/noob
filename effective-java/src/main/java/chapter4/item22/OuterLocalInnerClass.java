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
    public void innerMethod() {
       class InnerCLass3 {
            private int age;//年龄
            private String name;//名字

            public InnerCLass3(int age, String name) {
                this.age = age;
                this.name = name;
            }
        }
        InnerCLass3 innerCLass3=new InnerCLass3(18, "lis");
        System.out.println(innerCLass3.name + " 年龄：" + innerCLass3.age);
        System.out.println(className + grade + "班的老师是：" + teacher);
    }

    public static void main(String[] args) {
        OuterLocalInnerClass outerClass=new OuterLocalInnerClass();
        outerClass.innerMethod();
    }

}
