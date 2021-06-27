public class WaitingState implements Runnable {
    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new WaitingState());
        System.out.println("1 " + WaitingState.t1.getState());
        t1.start();
        System.out.println("2 " + WaitingState.t1.getState());
    }

    public void run() {
        Thread t2 = new Thread(new DemoThreadWS());
        t2.setName("t2");
        t2.start();
        Thread t3 = new Thread(new DemoThreadWS(), "t3");
        t3.start();
        Thread t4 = new Thread(new DemoThreadWS(), "t4");
        t4.start();
        Thread t5 = new Thread(new DemoThreadWS(), "t5");
        t5.start();
        Thread t6 = new Thread(new DemoThreadWS(), "t6");
        t6.start();
        System.out.println("3 " + WaitingState.t1.getState());
        try {
            System.out.println("4 " + WaitingState.t1.getState());
            // Waits for this thread to die
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            System.out.println("5 " + WaitingState.t1.getState());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}

class DemoThreadWS implements Runnable {
    public void run() {
        try {
            System.out.println("6 " + WaitingState.t1.getState());
            Thread.sleep(5000 * 10);
            System.out.println("7 " + WaitingState.t1.getState());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        System.out.println("8 " + WaitingState.t1.getState());
    }
}