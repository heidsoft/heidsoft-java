import java.util.concurrent.TimeUnit;

public class ThreadSleepState {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello");
        int gCount = 0;
        Thread t1 = new Thread1(gCount);
        System.out.println("t1 start before state  " + t1.getState().toString());
        t1.start();

//        new Thread(new Idle(), "Idle").start();
//        for(int index =0; index < 30; index ++){
//            new Thread(new Busy(), "Busy-"+index).start();
//        }


//        Thread t2 = new Thread1(gCount);
//
//        t2.wait();
//        t2.notify();
//        System.out.println("t2 start after  state " + t1.getState().toString());

    }
}

class Idle implements Runnable {

    @Override
    public void run() {
        try {
            TimeUnit.HOURS.sleep(1);
        } catch (InterruptedException e) {
        }
    }
}

class Busy implements Runnable {
    @Override
    public void run() {
        while (true) {
            "Foo".matches("F.*");
        }
    }
}


class Thread1 extends Thread {
    int count;

    public Thread1(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                count++;
                Thread.sleep(1000);
                System.out.println("t1 run  state " + Thread.currentThread().getState().toString() + " count " + count);
                if (count > 10000) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}