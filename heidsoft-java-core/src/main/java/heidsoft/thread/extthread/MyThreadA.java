package heidsoft.thread.extthread;

import heidsoft.thread.extobject.MyObject;

/**
 * 证明线程锁是对象
 */
public class MyThreadA extends Thread{
    private MyObject myObject;

    public MyThreadA(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
