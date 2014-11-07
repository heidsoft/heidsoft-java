package heidsoft.test;

/**
 * volatitle ���������������
 *
 * @author heidsoft
 */
public class TestVolatile {
    public static volatile int race = 0;

    public static void increase() {
        race++;
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];

        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {

                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }
                }
            });

            threads[i].start();
        }

        //�ȴ������ۼ��̶߳�����
        while (Thread.activeCount() > 1) {
            //�÷�����sleep()���ƣ�ֻ�ǲ������û�ָ����ͣ�೤ʱ�䣬
            //����yield��������ֻ����ͬ���ȼ����߳���ִ�еĻ�ᡣ
            Thread.yield();

            System.out.println(race);
        }
    }
}
