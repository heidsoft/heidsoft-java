package trycatch;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * finally的代码在return之后执行
 * @program: heidsoft-java
 * @description: 测试finally
 * @author: heidsoft
 * @create: 2018-12-24 17:30
 **/
public class TryCatchFinallyLock {

    private static int gValue = 0;

    public static void main(String[] args) {
        Work work1 = new Work("work1");
        Work work2 = new Work();
        work1.start();
        System.out.println("gValue1="+gValue);
        work2.start();
        System.out.println("gValue2="+gValue);
    }



    static class Work extends Thread{

        public Work(){
            super();
        }

        public Work(String name){
            setName(name);
        }


        @Override
        public void run() {
            Lock lock = new ReentrantLock();
            try{
                gValue++;
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }finally {
                lock.unlock();
            }
        }
    }
}
