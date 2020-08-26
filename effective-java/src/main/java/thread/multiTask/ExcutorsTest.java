package thread.multiTask;

import java.util.List;
import java.util.concurrent.*;

public class ExcutorsTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());

        List<Future<Integer>> futures = executorService.invokeAll(List.of(new MetaTask()));

        futures.forEach(System.out::println);
    }
}
