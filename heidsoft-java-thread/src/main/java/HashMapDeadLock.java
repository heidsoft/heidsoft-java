import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @description 非线程安全的Map测试
 * @author heidsoft
 */
public class HashMapDeadLock implements Callable<Integer> {

    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    private static Map<Integer, Integer> results = new HashMap<>();

    @Override
    public Integer call() throws Exception {
        return getInteger(results);
    }


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try {
            for (int i = 0; i < 2000; i++) {
                HashMapDeadLock hashMapDeadLock  = new HashMapDeadLock();
//           Future<Integer> future = threadPool.submit(hashMapDeadLock);
//           future.get();
                threadPool.submit(hashMapDeadLock);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
