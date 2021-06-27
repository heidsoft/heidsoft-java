package heidsoft.thread.privatenum;

/**
 *如果多个线程同时操作一个对象中的，实例变量，则有可能发生线程非安全，
 *此时通过，在方法前加 synchronized 解决
 */
public class HasSelfPrivateNum1 {
    //类级别实例变量
    private  int num = 0;

    //在方法前面加入锁
    synchronized public  void add1(String username){
        //方法中的变量是线程安全的
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
