package heidsoft.thread.extthread;

import heidsoft.thread.extobject.MyObject2;

/**
 * 证明线程锁是对象
 */
public class MyThreadA1 extends Thread{
    private MyObject2 myObject;

    public MyThreadA1(MyObject2 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
