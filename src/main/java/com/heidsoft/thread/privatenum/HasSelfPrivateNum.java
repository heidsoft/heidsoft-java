package com.heidsoft.thread.privatenum;

/**
 *
 */
public class HasSelfPrivateNum {
    public void add1(String username){
        //方法中的变量是线程安全的
        int num = 0;
        try {
            if( username.equals("a")){
                num = 100;
                System.out.println("a set over");

                //毫秒
                Thread.sleep(2000);

            }else{
                num = 200;
                System.out.println("b set over");
            }

            System.out.println(username + " num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
