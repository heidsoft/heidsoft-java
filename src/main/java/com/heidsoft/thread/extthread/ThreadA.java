package com.heidsoft.thread.extthread;

import com.heidsoft.thread.privatenum.HasSelfPrivateNum;

/**
 * 工作线程A
 */
public class ThreadA extends Thread{
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.add1("a");
    }
}
