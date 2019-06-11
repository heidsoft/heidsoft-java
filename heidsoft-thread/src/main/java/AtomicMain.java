import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * 原子类型使用
 */
public class AtomicMain {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.range(0, 100).forEach(i ->
                executorService.submit(atomicInteger::incrementAndGet)
        );

        System.out.println("==shutdown==start==");

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                long beginTime = System.currentTimeMillis();
                executorService.shutdown();
                long consumerTime = System.currentTimeMillis() - beginTime;
                System.out.println("consumer time " + consumerTime);
            }
        }));

        System.out.println("==shutdown==end==");
        System.out.println(atomicInteger);
    }
}
