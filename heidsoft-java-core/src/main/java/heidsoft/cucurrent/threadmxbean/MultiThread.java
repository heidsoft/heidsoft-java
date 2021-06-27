package heidsoft.cucurrent.threadmxbean;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 管理线程bean测试使用
 */
public class MultiThread {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(true,true);
        for(ThreadInfo threadInfo : threadInfos){

            System.out.println("["+threadInfo.getThreadId() + "] "
                    + threadInfo.getThreadName() + " "
//                    + threadInfo.getPriority() + " "
                    + threadInfo.getThreadState()
            );
        }
    }
}
