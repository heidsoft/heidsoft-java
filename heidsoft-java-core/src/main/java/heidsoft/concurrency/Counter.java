package heidsoft.concurrency;

/**
 * @author heidsoft
 *
 * 计数器
 */
public class Counter {
    int i = 0;

    public void increment(){
        // i++ 不是一个原子操作
        i++;
        // get i
        // increment
        // set i
    }

    public int getI(){
        return i;
    }
}
