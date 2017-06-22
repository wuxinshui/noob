package chapter4.item22;

/**
 * <p>OuterStaticInnerClass</p>
 * 静态成员类
 *
 * @author wuxinshui
 */
public class OuterStaticInnerClass {

    private String teacher;//老师
    private static int grade;//年级
    private static String className;//班级名称

    public OuterStaticInnerClass() {
        this.grade = 1;
        this.className = "高三";
        this.teacher = "王莉";
    }

    public void outerPrint() {
        System.out.println("OuterStaticInnerClass.outerPrint");
        System.out.println(className + grade + "班的老师是：" + teacher);
    }

    //公有静态类成员
    public static class PublicInnerCLass {
        private int age;//年龄
        private String name;//名字

        //构造方法
        public PublicInnerCLass() {

        }

        //带参构造方法
        public PublicInnerCLass(int age, String name) {
            this.age = age;
            this.name = name;
        }

        //实例成员方法
        public String print() {
            //静态类可以访问外围类的成员
            new OuterStaticInnerClass().outerPrint();
            System.out.println("OuterStaticInnerClass:PublicInnerCLass");
            return name + " 年龄：" + age + ",班级：" + className + Integer.toString(grade) + "班,老师：" + new OuterStaticInnerClass().teacher;
        }
    }

    //私有静态类成员
    private static class PrivateInnerCLass {
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
            System.out.println(name + " 年龄：" + age + ",班级：" + className + Integer.toString(grade) + "班,老师：" + new OuterStaticInnerClass().teacher);
        }
    }

    public static void main(String[] args) {
        //类内部实例化
        // 如果静态成员类是私有的，只能在外围类的内部才能访问
        OuterStaticInnerClass outerClass = new OuterStaticInnerClass();
        PrivateInnerCLass privateInnerCLass = new PrivateInnerCLass();
        PublicInnerCLass publisInnerCLass = new PublicInnerCLass();
    }

}
