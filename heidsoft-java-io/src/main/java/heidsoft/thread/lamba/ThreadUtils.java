package heidsoft.thread.lamba;

import java.util.concurrent.*;
/**
 * @ program: heidsoft-java
 * @ description: ThreadUtils
 * @ author: heidsoft
 * @ create: 2018-06-29 12:27
 **/
public class ThreadUtils {

    public static final MwExtendThreadPoolExecutor THREAD_POOL_EXECUTOR;

    /**
     * 初始化 thread pool
     */
    static {
        THREAD_POOL_EXECUTOR = new MwExtendThreadPoolExecutor(8, 32, 5L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
    }

    public static void executePoolThread(Runnable runnable) {
        // returns the task queue
        BlockingQueue<Runnable> waitThreadQueue = THREAD_POOL_EXECUTOR.getQueue();
        // returns the running work
        LinkedBlockingQueue<Runnable> workThreadQueue = THREAD_POOL_EXECUTOR.getWorkBlockingQueue();
        if (!waitThreadQueue.contains(runnable) && !workThreadQueue.contains(runnable)) {
            System.out.println("mw workThread: add to  workThreadQueue");
            // 添加到线程池
            THREAD_POOL_EXECUTOR.execute(runnable);
        } else {
            System.out.println("mw workThread: is already in waitThreadQueue or workThreadQueue");
        }
    }

    /**
     * 在线程池中执行任务
     *
     * @param task
     * @param <T>
     * @return
     */
    public static <T> Future<T> executePoolThread(Callable<T> task) {
        return THREAD_POOL_EXECUTOR.submit(task);
    }

    /**
     * @param millis
     */
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void shutdown(){
        THREAD_POOL_EXECUTOR.shutdown();
    }
}
