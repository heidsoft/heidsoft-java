package heidsoft.thread.test;

import heidsoft.thread.extobject.MyObject;
import heidsoft.thread.extthread.MyThreadA;
import heidsoft.thread.extthread.MyThreadB;

/**
 * 两个不同的实例，两个不同线程（本来应该是同步方法，但结果是异步执行，
 * 说明系统生成的两把系统锁）
 */
public class MyRun {
    public static void main(String[] args) {
        MyObject object = new MyObject();

        MyThreadA myThreadA = new MyThreadA(object);
        myThreadA.setName("A");

        MyThreadB myThreadB = new MyThreadB(object);
        myThreadB.setName("B");

        myThreadA.start();
        myThreadB.start();

    }

}
