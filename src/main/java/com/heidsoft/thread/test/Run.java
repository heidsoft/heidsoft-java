package com.heidsoft.thread.test;

import com.heidsoft.thread.extthread.ThreadA;
import com.heidsoft.thread.extthread.ThreadB;
import com.heidsoft.thread.privatenum.HasSelfPrivateNum;

/**
 * 测试工作线程A/B
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
    /*
    a set over
    b set over
    bnum=200
    anum=100
     */
}
