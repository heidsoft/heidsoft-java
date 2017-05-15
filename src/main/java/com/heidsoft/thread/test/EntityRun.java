package com.heidsoft.thread.test;

import com.heidsoft.thread.entity.PublicVar;
import com.heidsoft.thread.extthread.EntityThreadA;

/**
 * 测试脏读
 */
public class EntityRun {
    public static void main(String[] args) {

        try {
            PublicVar publicVar = new PublicVar();

            EntityThreadA threadA = new EntityThreadA(publicVar);
            threadA.start();//开启线程
            threadA.setName("publicVar");
            Thread.sleep(5000);//打印结果受到此值大小的影像

            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
