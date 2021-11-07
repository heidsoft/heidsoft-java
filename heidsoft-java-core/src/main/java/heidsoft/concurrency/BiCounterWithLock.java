package heidsoft.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author heidsoft
 *
 * 计数器, 使用 synchronized 进行同步
 */
public class BiCounterWithLock {
    private int i = 0;
    private int j = 0;

    private Lock lockForI = new ReentrantLock();
    private Lock lockForJ = new ReentrantLock();

    public void incrementI(){
        lockForI.lock();
        try{
            i++;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lockForI.unlock();
        }

        // get i
        // increment
        // set i
    }

    public int getI(){
        return i;
    }

    public void incrementJ(){
        // j++ 不是一个原子操作
        lockForJ.lock();
        try{
            j++;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lockForJ.unlock();
        }
        // get j
        // increment
        // set j
    }

    synchronized public int getJ(){
        return j;
    }
}
