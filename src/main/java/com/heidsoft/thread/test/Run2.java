package com.heidsoft.thread.test;

import com.heidsoft.thread.extthread.ThreadA;
import com.heidsoft.thread.extthread.ThreadB;
import com.heidsoft.thread.privatenum.HasSelfPrivateNum;

/**
 * 两个不同的实例，两个不同线程（本来应该是同步方法，但结果是异步执行，
 * 说明系统生成的两把系统锁）
 */
public class Run2 {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA threadA1 = new ThreadA(numRef1);
        threadA1.start();
        ThreadB threadB1 = new ThreadB(numRef2);
        threadB1.start();
    }

    /*
    a set over
    b set over
    b num=200
    a num=100
    */

}
