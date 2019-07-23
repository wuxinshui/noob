package thread.threadpoolexecutor;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DivTask implements Runnable {
    int a, b;

    public DivTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        double c = a / b;
        System.out.println("divid result: " + c);
    }

    /**
     * Exception in thread "pool-1-thread-1" java.lang.ArithmeticException: / by zero
     * at thread.threadpoolexecutor.DivTask.run(DivTask.java:17)
     * at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
     * at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
     * at java.base/java.lang.Thread.run(Thread.java:834)
     * divid result: 25.0
     * divid result: 100.0
     * divid result: 33.0
     * divid result: 50.0
     *
     * @param args
     */
    public static void main(String[] args) {
        ThreadPoolExecutor pools = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 0l, TimeUnit.SECONDS, new SynchronousQueue<>());

        for (int i = 0; i < 5; i++) {
//            吃掉异常，submit，没有抛出业务异常
//            pools.submit(new DivTask(100, i));
            pools.execute(new DivTask(100, i));
        }


    }


}
