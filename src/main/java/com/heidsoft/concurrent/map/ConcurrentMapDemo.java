package com.heidsoft.concurrent.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapDemo {

    public static void main(String []args){
        ConcurrentMap<String,String> cHashMapDemo1 = new ConcurrentHashMap<String,String>();
        Map<String, String> hashMapDemo2 = Collections.synchronizedMap(new HashMap<String, String>());

        //用并发Map 替换老式的同步Map,系统可以极大提升并发应用程序的性能
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random(1000);
                while (true){

                    cHashMapDemo1.putIfAbsent("","");
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                cHashMapDemo1.putIfAbsent("","");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                cHashMapDemo1.putIfAbsent("","");
            }
        });


        thread1.start();
        thread2.start();
        thread3.start();




    }
}
