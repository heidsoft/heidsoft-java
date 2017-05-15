package com.heidsoft.thread.test;

/**
 * wait 测试,在没有对象监视器的情况下，也就是没有同步锁
 * Exception in thread "main" java.lang.IllegalMonitorStateException
 */
public class WaitTest1 {
    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
