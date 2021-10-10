package com.heidsoft.chapter11;

import java.util.concurrent.TimeUnit;

/**
 * 线程停止方式
 * 1。不要使用Thread.stop
 */
public class StopThread{
    /**
     * 线程停止标志,这种方式不好
     * 主线程将stopRequested 设置为true, 想使后台线程停止，
     * 但是主线程的修改，并没有同步，也就是说不能保证后台线程在主线程
     * 修改后，能感知到变量的值变了，没有感知到，则后台线程不会停止
     */
    private static boolean stopRequested = false;

    public static void main(String[] args) throws InterruptedException {
        /**
         * 箭头函数实现，线程的工作任务
         */
        Thread backgroundThread = new Thread(()->{
            int i = 0;
            while (!stopRequested){
                i++;
                System.out.println(i);
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

}
