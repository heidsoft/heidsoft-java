package heidsoft.concurrency;

/**
 * @author heidsoft
 *
 * 计数器, 使用 synchronized 进行同步
 */
public class BiCounter {
    private int i = 0;
    private int j = 0;

    synchronized public void incrementI(){
        // i++ 不是一个原子操作
        i++;
        // get i
        // increment
        // set i
    }

   synchronized public int getI(){
        return i;
    }

    synchronized public void incrementJ(){
        // j++ 不是一个原子操作
        j++;
        // get j
        // increment
        // set j
    }

    synchronized public int getJ(){
        return j;
    }
}
