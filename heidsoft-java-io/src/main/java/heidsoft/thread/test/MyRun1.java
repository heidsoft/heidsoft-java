package heidsoft.thread.test;

import heidsoft.thread.extobject.MyObject2;
import heidsoft.thread.extthread.MyThreadA1;
import heidsoft.thread.extthread.MyThreadB1;

/**
 * 两个不同的实例，两个不同线程（本来应该是同步方法，但结果是异步执行，
 * 说明系统生成的两把系统锁）
 */
public class MyRun1 {
    public static void main(String[] args) {
        MyObject2 object = new MyObject2();

        MyThreadA1 myThreadA = new MyThreadA1(object);
        myThreadA.setName("A");

        MyThreadB1 myThreadB = new MyThreadB1(object);
        myThreadB.setName("B");

        myThreadA.start();
        myThreadB.start();

    }

}
