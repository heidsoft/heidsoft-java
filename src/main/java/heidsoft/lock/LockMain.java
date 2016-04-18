package heidsoft.lock;

/**
 * <code>LockMain</code>
 *
 * @description: 锁测试
 * @version:0.0.1
 * @author:liubin(wind.b.liu@leaptocloud.com)
 * @date:2016/4/18 12:05
 */
public class LockMain {
    public static void main(String[] args) {
        LockService lockService = new LockService();
        Thread thread1 = new Thread(new LockThread(lockService));
        Thread thread2 = new Thread(new LockThread(lockService));
        Thread thread3 = new Thread(new LockThread(lockService));
        Thread thread4 = new Thread(new LockThread(lockService));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.notify();


    }
}
