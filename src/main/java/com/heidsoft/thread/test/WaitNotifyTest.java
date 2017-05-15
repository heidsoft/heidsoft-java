package com.heidsoft.thread.test;

import com.heidsoft.thread.extthread.MyThread1;
import com.heidsoft.thread.extthread.MyThread2;

/**
 * 测试线程 等待/唤醒 的程序入口
 */
public class WaitNotifyTest {
    public static void main(String[] args) {
        try{
            Object lock = new Object();//创建一个对象锁

            MyThread1 thread1 = new MyThread1(lock);
            thread1.start();

            Thread.sleep(3000);

            MyThread2 thread2 = new MyThread2(lock);
            thread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
