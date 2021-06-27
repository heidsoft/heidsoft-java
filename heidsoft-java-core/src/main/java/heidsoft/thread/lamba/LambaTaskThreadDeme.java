package heidsoft.thread.lamba;

import java.util.concurrent.TimeUnit;

/**
 * lamba 线程使用
 */
public class LambaTaskThreadDeme {

    public static void  main(String[] args){

        Runnable task = () ->{
            String threadName = Thread.currentThread().getName();
            System.out.println("hello 1 " + threadName);
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("hello 2 " + threadName);
        };

        task.run();

        Thread mythread = new Thread(task);

        mythread.start();

        System.out.println("Done");
    }
}
