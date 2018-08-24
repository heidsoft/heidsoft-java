package heidsoft.thread.lamba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: heidsoft-java
 * @description: MwExtendThreadPoolExecutor
 * @author: heidsoft
 * @create: 2018-06-29 12:30
 **/
public class MwExtendThreadPoolExecutor extends ThreadPoolExecutor {

    private static Logger LOGGER = LoggerFactory.getLogger(MwExtendThreadPoolExecutor.class);


    /**
     * 记录运行中任务
     */
    private LinkedBlockingQueue<Runnable> workBlockingQueue = new LinkedBlockingQueue<>();

    public MwExtendThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                      BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }


    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        // 保存在运行的任务
        workBlockingQueue.add(r);
        LOGGER.debug("Before the task execution");
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        // 移除关闭的任务
        workBlockingQueue.remove(r);
        LOGGER.debug("After the task execution");
    }

    /**
     * Description: 正在运行的任务
     *
     * @return LinkedBlockingQueue<Runnable><br>
     * @author lishun
     */
    public LinkedBlockingQueue<Runnable> getWorkBlockingQueue() {
        return workBlockingQueue;
    }
}