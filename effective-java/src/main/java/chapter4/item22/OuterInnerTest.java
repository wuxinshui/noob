package chapter4.item22;

/**
 * <p>OuterInnerTest</p>
 *
 * @author wuxinshui
 */
public class OuterInnerTest {
    public static void main(String[] args) {
//        outerStaticInnerClassTest();
//        outerNonStaticInnerClassTest();
//        outerAnonymousInnerInterTest();
        outerLocalInnerClassTest();
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

        System.out.println(publisInnerCLass.print());
    }

    public static void outerNonStaticInnerClassTest() {
        //类内部实例化
        // 非静态成员类的实例方法内部可以调用外围实例的方法。
        //在没有外围实例的情况下，创建非静态成员类的实例是不可能的。
        //非静态成员类的每个实例都隐含着与外围类的一个外围实例相关联。
        OuterNonStaticInnerClass outerClass = new OuterNonStaticInnerClass();
        //chapter4.item22.OuterNonStaticInnerClass.PrivateInnerCLass' has private access in 'chapter4.item22.OuterNonStaticInnerClass
        //OuterNonStaticInnerClass.PrivateInnerCLass privateInnerCLass = outerClass.new PrivateInnerCLass();
        //privateInnerCLass.print();
        OuterNonStaticInnerClass.PublicInnerCLass publicInnerCLass = outerClass.new PublicInnerCLass(18, "lis");
        System.out.println(publicInnerCLass.print());
    }

    public static void outerAnonymousInnerInterTest() {
        OuterAnonymousInnerInter innerInter = new OuterAnonymousInnerInter() {
            private String teacher = "王莉";
            @Override
            public void print(int age, String name) {
                System.out.println("OuterAnonymousInnerInter anonymous inner class");
                System.out.println(name + " 年龄：" + age + "老师：" + teacher);
            }
        };
        innerInter.print(18, "lis");


        OuterAnonymousInnerClass outerClass = new OuterAnonymousInnerClass() {
            private String teacher = "王莉";
            @Override
            public void innerMethod(int age, String name) {
                System.out.println("OuterAnonymousInnerClass innerMethod");
                System.out.println(name + " 年龄：" + age + "老师：" + teacher);
            }
        };
        outerClass.innerMethod(18, "lis");
    }

    public static void outerLocalInnerClassTest(){
        OuterLocalInnerClass outerClass=new OuterLocalInnerClass();
        outerClass.innerMethod();
    }
}
