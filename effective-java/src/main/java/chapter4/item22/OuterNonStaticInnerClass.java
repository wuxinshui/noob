package chapter4.item22;

/**
 * <p>OuterStaticInnerClass</p>
 *
 * @author wuxinshui
 */
public class OuterNonStaticInnerClass {
    private String teacher;
    private static int grade;//年级
    private static String className;//班级名称

    public OuterNonStaticInnerClass() {
        this.grade = 1;
        this.className = "高三";
        this.teacher = "王莉";
    }

    public void outerPrint() {
        System.out.println("OuterNonStaticInnerClass.outerPrint");
        System.out.println(className + grade + "班的老师是：" + teacher);
    }

    public class PublicInnerCLass {
        private int age;//年龄
        private String name;//名字

        //构造方法
        public PublicInnerCLass() {

        }

        public PublicInnerCLass(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String print() {
            // 非静态成员类的实例方法内部可以调用外围实例的方法和变量。
            outerPrint();
            System.out.println("OuterStaticInnerClass:PublicInnerCLass");
            return name + " 年龄：" + age + ",班级：" + className + Integer.toString(grade) + "班,老师：" + teacher;
        }
    }

    private class PrivateInnerCLass {
        private int age;//年龄
        private String name;//名字

        public PrivateInnerCLass() {

        }

        public PrivateInnerCLass(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public void print() {
            System.out.println("OuterStaticInnerClass:PrivateInnerCLass");
            System.out.println(name + " 年龄：" + age + ",班级：" + className + Integer.toString(grade) + "班,老师：" + teacher);
        }

    }

    public static void main(String[] args) {
        //类内部实例化
        // 非静态成员类的实例方法内部可以调用外围实例的方法。
        //在没有外围实例的情况下，创建非静态成员类的实例是不可能的。
        //非静态成员类的每个实例都隐含着与外围类的一个外围实例相关联。
        OuterNonStaticInnerClass outerClass = new OuterNonStaticInnerClass();
        PrivateInnerCLass privateInnerCLass = outerClass.new PrivateInnerCLass(18, "lis");
        privateInnerCLass.print();
        PublicInnerCLass publicInnerCLass = outerClass.new PublicInnerCLass(18, "lis");
        System.out.println(publicInnerCLass.print());
    }

}
