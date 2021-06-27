package top.cloudmesh.join;

/**
 * thread join 方法测试
 */
public class JoinDemo {
    public static volatile int count = 0;

    //多线程访问控制
    public static synchronized void inccount() {
        count++;
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    inccount();
                }
            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    inccount();
                }
            }
        }, "t2");

        t1.start();
        t2.start();
        try {
            t1.join();
            System.out.println("main: " + Thread.currentThread().getState());
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("value: " + count);
    }
}
