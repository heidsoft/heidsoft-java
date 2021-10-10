package com.heidsoft.chapter11;

import java.util.concurrent.TimeUnit;

/**
 * 线程停止方式,推荐方式
 */
public class SerialNumberBad {
    /**
     * 变量在读与写时都被同步，否则无法保证同步起到作用
     */
    private static volatile int  nextSerialNumber = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            System.out.println(generateSerialNumber());
        });
        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println(generateSerialNumber());
        });
        t2.start();
    }

    /**
     * ++ 操作不是原子化的
     * public static int generateSerialNumber();
     *     Code:
     *        0: getstatic     #7                  // Field nextSerialNumber:I
     *        3: dup
     *        4: iconst_1
     *        5: iadd
     *        6: putstatic     #7                  // Field nextSerialNumber:I
     *        9: ireturn
     * @return
     */
    public static int generateSerialNumber(){
        return nextSerialNumber++;
    }

}
