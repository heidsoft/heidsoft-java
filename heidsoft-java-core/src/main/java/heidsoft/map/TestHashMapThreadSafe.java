package heidsoft.map;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author heidsoft
 * 测试HashMap在并非下的执行情况
 */
public class TestHashMapThreadSafe {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("class object destroy");
        super.finalize();
    }

    public static void main(String[] args) throws InterruptedException {
        final HashMap<String, String> map = new HashMap<String, String>(2);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200000; i++) {
                    System.out.println(String.format("%d", i));
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            //多线程Put
                            map.put(UUID.randomUUID().toString(), "");
                            System.out.println(String.format("map 大小是： %d", map.size()));
                        }
                    }, "ftf" + i).start();
                }
            }
        }, "ftf");
        t.start();
        //Waits for this thread to die.
        t.join();
    }
}
