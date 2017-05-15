package com.heidsoft.thread.extthread;

import com.heidsoft.thread.extobject.MyObject2;

/**
 * 证明线程锁是对象
 */
public class MyThreadB1 extends Thread{
    private MyObject2 myObject;

    public MyThreadB1(MyObject2 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodB();
    }
}
