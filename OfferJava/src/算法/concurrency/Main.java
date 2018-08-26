package 算法.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        BlockingQueueImpl test = new BlockingQueueImpl();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(test.new Producer());
        executorService.execute(test.new Producer());
        executorService.execute(test.new Producer());
        executorService.execute(test.new Consumer());
        executorService.execute(test.new Consumer());
    }
}
