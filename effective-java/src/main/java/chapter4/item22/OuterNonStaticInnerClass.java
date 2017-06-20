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
            //静态类可以访问外围类的静态成员
            System.out.println("OuterStaticInnerClass:PublicInnerCLass");
            return name + " 年龄：" + age + ",班级：" + className + Integer.toString(grade) + "班,老师：" + teacher;
        }
    }

    private class PrivateInnerCLass {
        private int age;//年龄
        private String name;//名字

        public void print() {
            System.out.println("OuterStaticInnerClass:InnerCLass1");
        }
    }

    public static void main(String[] args) {
        //类内部实例化
        // 如果静态成员类是私有的，只能在外围类的内部才能访问
        OuterStaticInnerClass outerClass = new OuterStaticInnerClass();
//        PrivateInnerCLass privateInnerCLass = new PrivateInnerCLass();
        //chapter4.item22.OuterNonStaticInnerClass.this' cannot be referenced from a static context
        //PublicInnerCLass publicInnerCLass=new PublicInnerCLass();
//        PublicInnerCLass publicInnerCLass=new OuterNonStaticInnerClass().PublicInnerCLass;
    }

}
