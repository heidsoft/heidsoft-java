package cn.ngtoken.thread;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.Random;
import java.util.concurrent.*;

/**
 *
 * 线程池样例
 * @author heidsoft
 */
public class ScheduledExecutorServiceExample {

    public static void main(String[] args) {

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        };



        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
                new BasicThreadFactory
                        .Builder()
                        .namingPattern("ngtoken-schedule-pool-%d")
                        .daemon(true)
                        .build());

        for (int index=0 ; index<1000; index++){
            FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
            executorService.submit(futureTask);

            try {
                System.out.println("futureTask value: "+futureTask.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }
}
