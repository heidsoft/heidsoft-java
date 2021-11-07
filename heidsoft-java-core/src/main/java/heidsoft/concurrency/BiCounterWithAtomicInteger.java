package heidsoft.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author heidsoft
 *
 * 计数器, 使用 AtomicInteger 原子类型
 */
public class BiCounterWithAtomicInteger {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();

    public void incrementI(){
        i.incrementAndGet();
    }

    public int getI(){
        return i.get();
    }

    public void incrementJ(){
        j.incrementAndGet();
    }

    synchronized public int getJ(){
        return j.get();
    }
}
