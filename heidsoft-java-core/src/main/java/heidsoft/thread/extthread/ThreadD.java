package heidsoft.thread.extthread;

import heidsoft.thread.privatenum.HasSelfPrivateNum1;

/**
 * 工作线程A
 */
public class ThreadD extends Thread{
    private HasSelfPrivateNum1 numRef;

    public ThreadD(HasSelfPrivateNum1 numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.add1("b");
    }
}
