package heidsoft.thread.lamba;

import java.util.concurrent.*;

/**
 * @program: heidsoft-java
 * @description: 线程池测试
 * @author: heidsoft
 * @create: 2018-06-25 19:10
 **/
public class LambaRunnableDemoExecutor2 {


    public static void main(String[] args) {


            Future future = ThreadUtils.executePoolThread(()->mytask("task"));
            try {
//                while(!future.isDone()){
//                   //说明是阻塞的
//                    System.out.println("is not done");
//                }

                //System.out.println(future.get());
                try {
                    System.out.println(future.get(5, TimeUnit.SECONDS));
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

             ThreadUtils.shutdown();

    }


    public static String mytask(String name){

        Thread.currentThread().setName(name);
        long start = System.currentTimeMillis();
        System.out.println(start);

        try {
            System.out.println(Thread.currentThread().getName()+"开始睡眠5000ms");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(Thread.currentThread().getName()+"工作完毕");
        return name;
    }
}
