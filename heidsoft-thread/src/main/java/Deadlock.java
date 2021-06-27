/**
 *
 *<p>Java stack information for the threads listed above:
 ===================================================
 "t2":
 at Deadlock$2.run(Deadlock.java:32)
 - waiting to lock <0x00000007955fcb10> (a java.lang.Object)
 - locked <0x00000007955fcb20> (a java.lang.Object)
 "t1":
 at Deadlock$1.run(Deadlock.java:16)
 - waiting to lock <0x00000007955fcb20> (a java.lang.Object)
 - locked <0x00000007955fcb10> (a java.lang.Object)

 Found 1 deadlock.</p>
 * @description 死锁模拟
 * @author heidsoft
 */
public class Deadlock {
    public static void main(String[] args) {
        System.out.println(" 死锁模拟 start ----- ");
        final Object lockObj1 = new Object(), lockObj2 = new Object();
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                synchronized (lockObj1) {
                    try {
                        System.out.println("thread t1 start...");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lockObj2) {
                        System.out.println("thread t1 done....");
                    }
                }
            }
        };

        Thread t2 = new Thread("t2") {
            @Override
            public void run() {
                synchronized (lockObj2) {
                    try {
                        System.out.println("thread t2 start...");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lockObj1) {
                        System.out.println("thread t2 done...");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }

}


