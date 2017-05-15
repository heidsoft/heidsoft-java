package com.heidsoft.thread.entity;

/**
 * Created by heidsoft on 2017/5/15.
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    public void setValue(String username,String password){
        try {

            this.username = username;
            Thread.sleep(5000);
            this.password = password;

            System.out.println("setValue method thread name="
                    + Thread.currentThread().getName() + " username="
                    + username + " password=" + password);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void getValue(){
        System.out.println("getValue method thread name="
                + Thread.currentThread().getName() + " username="
                + username + " password=" + password);
    }
}
