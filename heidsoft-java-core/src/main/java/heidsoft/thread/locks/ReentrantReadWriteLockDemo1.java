package heidsoft.thread.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 可重入锁测试练习
 */
public class ReentrantReadWriteLockDemo1 {

    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private static Lock rlock = lock.readLock();
    private static Lock wlock = lock.writeLock();

    public static void main(String[] args) {
        Work w1 = new Work();
        Work w2 = new Work();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        t1.start();
        t2.start();
    }

    static class Work implements Runnable {
        @Override
        public void run() {
            rlock.lock();
            System.out.println(Thread.currentThread().getId() + " run lock test");
            rlock.unlock();
        }
    }
}
