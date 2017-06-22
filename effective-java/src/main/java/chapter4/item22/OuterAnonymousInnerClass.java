package chapter4.item22;

/**
 * <p>OuterStaticInnerClass</p>
 *
 * @author wuxinshui
 */
public abstract class OuterAnonymousInnerClass {

    //成员方法
    public abstract void innerMethod(int age, String name);

    public static void main(String[] args) {
        OuterAnonymousInnerClass outerClass = new OuterAnonymousInnerClass() {
            private String teacher = "王莉";

            //Inner classes cannot have static declarations
//            private static int grade;//年级
//            private static String className;//班级名称
            @Override
            public void innerMethod(int age, String name) {
                System.out.println("OuterAnonymousInnerClass innerMethod");
                System.out.println(name + " 年龄：" + age + "老师：" + teacher);
            }
        };
        outerClass.innerMethod(18, "lis");
    }

}
