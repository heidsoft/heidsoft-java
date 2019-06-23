package heidsoft.thread.notify;

// 线程唤醒
public class ThreadNofifyDemo {
    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB) {
            try {
                System.out.println("threadB thread wait finishing ......");
                threadB.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadB.total);
        }


    }
}

class ThreadB extends Thread {
    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            System.out.println("1111");
            notify();
            System.out.println("2222");
        }
    }
}