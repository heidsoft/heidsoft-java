package heidsoft.thread.lamba;

import java.util.concurrent.*;

/**
 * @program: heidsoft-java
 * @description: Executor使用lamba方法编写
 * @author: heidsoft
 * @create: 2018-06-25 19:10
 **/
public class LambaRunnableDemoExecutor {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future future1 =  executor.submit(()->worker("work1"));
        Future future2 =  executor.submit(()->worker("work2"));
        Future future3 =  executor.submit(()->worker("work3"));
        Future future4 =  executor.submit(()->worker("work4"));
        Future future5 =  executor.submit(()->worker("work5"));
        try {
            //线程任务是否执行完毕
            String fval1 = (String)future1.get();
            future1.isDone();
            String fval2 = (String)future2.get();
            String fval3 = (String)future3.get();
            executor.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


    public static String worker(String name){

        Thread.currentThread().setName(name);
        long start = System.currentTimeMillis();
        System.out.println(start);

        try {
            System.out.println(Thread.currentThread().getName()+"开始睡眠5000ms");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(Thread.currentThread().getName()+"工作完毕");
        return name;
    }
}
