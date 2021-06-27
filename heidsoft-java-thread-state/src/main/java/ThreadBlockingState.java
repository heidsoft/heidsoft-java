/**
 * NEW- thread object created, but not started.
 * RUNNABLE- thread is executing.
 * BLOCKED- waiting for monitor after calling wait() method.
 * WAITING- when wait() if called & waiting for notify() to be called.
 * Also when join() is called.
 * TIMED_WAITING- when below methods are called:
 * Thread.sleep
 * Object.wait with timeout
 * Thread.join with timeout
 * TERMINATED- thread returned from run() method.
 * https://stackoverflow.com/questions/15680422/difference-between-wait-and-blocked-thread-states
 */
public class ThreadBlockingState {

    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Object obj2 = new Object();
        Thread3 t3 = new Thread3(obj, obj2);
        Thread.sleep(1000);
        System.out.println("nm:" + t3.getName() + ",state:" + t3.getState().toString() +
                ",when Wait() is called & waiting for notify() to be called.");
        Thread4 t4 = new Thread4(obj, obj2);
        Thread.sleep(3000);
        System.out.println("nm:" + t3.getName() + ",state:" + t3.getState().toString() + ",After calling Wait() & waiting for monitor of obj2.");
        System.out.println("nm:" + t4.getName() + ",state:" + t4.getState().toString() + ",when sleep() is called.");
    }

}

class Thread3 extends Thread {
    Object obj, obj2;
    int cnt;

    Thread3(Object obj, Object obj2) {
        this.obj = obj;
        this.obj2 = obj2;
        this.start();
    }

    @Override
    public void run() {
        super.run();
        synchronized (obj) {
            try {
                System.out.println("nm:" + this.getName() + ",state:" + this.getState().toString() + ",Before Wait().");
                obj.wait();
                System.out.println("nm:" + this.getName() + ",state:" + this.getState().toString() + ",After Wait().");
                synchronized (obj2) {
                    cnt++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread4 extends Thread {
    Object obj, obj2;

    Thread4(Object obj, Object obj2) {
        this.obj = obj;
        this.obj2 = obj2;
        this.start();
    }

    @Override
    public void run() {
        super.run();
        synchronized (obj) {
            System.out.println("nm:" + this.getName() + ",state:" + this.getState().toString() + ",Before notify().");
            obj.notify();
            System.out.println("nm:" + this.getName() + ",state:" + this.getState().toString() + ",After notify().");
        }
        synchronized (obj2) {
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}