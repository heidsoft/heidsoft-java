package heidsoft.lock;

/**
 * <code>LockThread</code>
 *
 * @description:锁测试线程
 * @version:0.0.1
 * @author:liubin(wind.b.liu@leaptocloud.com)
 * @date:2016/4/18 12:04
 */
public class LockThread implements Runnable {
    private LockService lockService;

    public LockThread(LockService lockService) {
        this.lockService = lockService;
    }

    @Override
    public void run() {
        lockService.testLock();
    }
}
