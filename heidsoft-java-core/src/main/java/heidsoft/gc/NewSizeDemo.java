package heidsoft.gc;

/**
 * -XX:+PrintCommandLineFlags -Xmx20m -Xms20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails
 */

/**
 * @program: heidsoft-java
 * @description: 内存测试
 * @author: heidsoft
 * @create: 2018-09-12 17:39
 **/
public class NewSizeDemo {
    public static void main(String[] args) {
        byte[] b = null;
        for(int i=0; i<10; i++){
            b = new byte[1*1024*1024];
        }
    }
}
