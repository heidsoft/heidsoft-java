package com.heidsoft.chapter11;

import java.util.concurrent.TimeUnit;

/**
 * 线程停止方式,推荐方式
 */
public class StopThreadGood {
    /**
     * 变量在读与写时都被同步，否则无法保证同步起到作用
     */
    private static boolean stopRequested = false;

    /**
     * 同步设置
     */
    private static synchronized void requestedStop(){
        stopRequested = true;
    }

    /**
     * 同步获取
     * @return
     */
    private static synchronized boolean stopRequested(){
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        /**
         * 箭头函数实现，线程的工作任务
         */
        Thread backgroundThread = new Thread(()->{
            int i = 0;
            while (!stopRequested()){
                i++;
                System.out.println(i);
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        /**
         * 同步方式设置，共享标记
         */
        requestedStop();
    }

}
