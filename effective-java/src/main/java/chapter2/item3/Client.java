package chapter2.item3;

/**
 * Created by Administrator on 2017/2/8.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Elvis.INSTANCE);
        Elvis elvis=Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
