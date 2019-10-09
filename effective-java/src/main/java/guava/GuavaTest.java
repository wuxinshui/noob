package guava;

import com.google.common.base.Stopwatch;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/10/8 17:48
 */
public class GuavaTest {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Thread.sleep(10);
        stopwatch.stop();
        System.out.println(stopwatch.elapsed().getNano());
    }
}
