package heidsoft.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author heidsoft
 */
public class HeidsoftThreadSync {
    private static boolean stopRequested;

    private synchronized static void stopRequested() {//д����ͬ��
        stopRequested = true;
    }

    private synchronized static boolean reqeustStop() {//������
        return stopRequested;
    }


    public static void main(String[] args) throws InterruptedException {
        Thread backGroudThread = new Thread(new Runnable() {

            int i = 0;

            @Override
            public void run() {

                while (!reqeustStop()) {
                    i++;
                    System.out.println("i=" + i);
                }
            }

        });

        backGroudThread.start();

        TimeUnit.SECONDS.sleep(1L);

        stopRequested();
    }

}
