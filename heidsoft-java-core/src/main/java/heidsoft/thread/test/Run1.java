package heidsoft.thread.test;

import heidsoft.thread.extthread.ThreadC;
import heidsoft.thread.extthread.ThreadD;
import heidsoft.thread.privatenum.HasSelfPrivateNum1;

/**
 * 测试工作线程C/D,类级别的实例变量，线程非安全
 *
 */
public class Run1 {
    public static void main(String[] args) {
        HasSelfPrivateNum1 numRef = new HasSelfPrivateNum1();
        ThreadC threadC1 = new ThreadC(numRef);
        threadC1.start();
        ThreadD threadD = new ThreadD(numRef);
        threadD.start();
    }

    /*
    a set over
    a set over
    anum=100
    anum=100
    */
}
