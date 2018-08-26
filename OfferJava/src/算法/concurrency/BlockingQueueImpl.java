package 算法.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueImpl {
    private int count = 0;
    private BlockingQueue<Integer> queue = new LinkedBlockingDeque<>(10);

    class Producer implements Runnable{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    queue.put(1);
                    count++;
                    System.out.println(Thread.currentThread().getName() + "生产者生产，目前总共有" + count);
                }catch (InterruptedException e){

                }
            }
        }
    }

    class Consumer implements Runnable{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    queue.take();
                    count--;
                    System.out.println(Thread.currentThread().getName() + "消费者消费，目前总共有" + count);
                }catch (InterruptedException e){

                }
            }
        }
    }

}
