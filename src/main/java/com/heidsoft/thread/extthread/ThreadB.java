package com.heidsoft.thread.extthread;

import com.heidsoft.thread.privatenum.HasSelfPrivateNum;

/**
 * 工作线程
 */
public class ThreadB extends Thread{
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.add1("b");
    }
}
