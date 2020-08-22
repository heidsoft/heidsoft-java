public class TimedWaitingState {
    public static void main(String[] args) throws InterruptedException {
        DemoThread obj1 = new DemoThread();
        Thread t1 = new Thread(obj1);
        t1.start();
        // The following sleep will give enough time for ThreadScheduler
        // to start processing of thread t1
        System.out.println("main thread sleep 1000");
        Thread.sleep(1000);
        System.out.println(t1.getState());
    }
}

class DemoThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("run sleep 5000*10");
            Thread.sleep(5000 * 10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
