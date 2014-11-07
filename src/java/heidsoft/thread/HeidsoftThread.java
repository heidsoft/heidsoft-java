package heidsoft.thread;

import java.util.concurrent.TimeUnit;

/**
 * û��ͬ��stopRequested�����������޵�ѭ����������˵��backGroudThread�߳�û�п������̶߳�stopRequested���е��޸ģ���Ϊû�дﵽ
 *
 * @author heidsoft
 */
public class HeidsoftThread {

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backGroudThread = new Thread(new Runnable() {

            int i = 0;

            @Override
            public void run() {

                while (!stopRequested) {//��Ѯ
                    i++;
                    System.out.println("i=" + i);
                }
            }

        });

        backGroudThread.start();//�����߳�

        TimeUnit.SECONDS.sleep(1L);

        stopRequested = true;
    }

}
