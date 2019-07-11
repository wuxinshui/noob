package thread;

/**
 * @Author: yoyo
 * @Description: https://segmentfault.com/g/1570000010635026/d/1560000019727828
 * @Date: Created in 2019/7/11 10:08
 */
public class BleepJoinStartTest {
    String name = "Bleep";

    public static void main(String[] args) throws InterruptedException {
        new BleepJoinStartTest().backgroundSetName();
    }

    void setName(String name) {
        this.name = name;
    }

    void backgroundSetName() throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                setName("Blat");
            }
        };
        t.start();
        t.join();
        System.out.println(name);
    }
}
