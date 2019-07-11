package construct;

/**
 * @Author: yoyo  构造方法
 * @Description:https://segmentfault.com/g/1570000010635026/d/1560000019727114?tdsourcetag=s_pcqq_aiomsg
 * @Date: Created in 2019/7/11 10:17
 */
public class Confusing {

    public Confusing(double[] dArray) {
        System.out.println("double array");
    }

    public Confusing(Object o) {
        System.out.println("Object");
    }

    public static void main(String args[]) {
        new Confusing(null);
    }

}
