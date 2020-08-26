package thread.multiTask;

import java.util.concurrent.Callable;

public class MetaTask implements Callable<Integer> {



    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread() + "- success");
        return 1;
    }
}
