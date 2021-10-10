package heidsoft.thread.extthread;

import heidsoft.thread.extobject.MyObject;

/**
 * 证明线程锁是对象
 */
public class MyThreadB extends Thread{
    private MyObject myObject;

    public MyThreadB(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
