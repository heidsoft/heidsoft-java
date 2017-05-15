package com.heidsoft.thread.extthread;

import com.heidsoft.thread.privatenum.HasSelfPrivateNum1;

/**
 * 工作线程A
 */
public class ThreadC extends Thread{
    private HasSelfPrivateNum1 numRef;

    public ThreadC(HasSelfPrivateNum1 numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.add1("a");
    }
}
