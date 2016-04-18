package heidsoft.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <code>LockService</code>
 *
 * @description: 锁服务测试
 * @version:0.0.1
 * @author:liubin(wind.b.liu@leaptocloud.com)
 * @date:2016/4/18 11:55
 */
public class LockService {
    private final ReentrantLock lock = new ReentrantLock();

    public void testLock() {
        System.out.println(lock.getHoldCount());
        lock.lock();//锁住
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        lock.unlock();
    }
}
