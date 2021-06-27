package heidsoft.cucurrent.executorservice;

import java.util.concurrent.*;

public class ExecutorsSubmitDemo {
    public static void main(String[] args){
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task = ()->{
            String threadName = Thread.currentThread().getName();
            System.out.println("hello "+ threadName);
        };

        executor.submit(task);


        System.out.println("Done1 "+ executor.isTerminated() );

        System.out.println("Done2 "+ executor.isTerminated() );
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {

            if(!executor.isTerminated()){
                executor.shutdown();
            }

            System.out.println("close ");
        }
    }
}
