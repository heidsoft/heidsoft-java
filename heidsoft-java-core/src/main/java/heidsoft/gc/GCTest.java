package heidsoft.gc;

/**
 * @program: heidsoft-java
 * @description: 垃圾回收测试
 * @author: heidsoft
 * @create: 2018-06-24 22:59
 **/
public class GCTest {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=3  -Xloggc:/Users/heidsoft/research/heidsoft-java/gc_log.txt -XX:+PrintGCTimeStamps
     */
    public static void testAllocation() {
        byte[][] allocation=new byte[10][];
        allocation[0] = new byte[1 * _1MB];
        allocation[1] = new byte[1 * _1MB];
        allocation[2] = new byte[1 * _1MB];
        allocation[3] = new byte[1 * _1MB];
        allocation[4] = new byte[1 * _1MB];
        allocation[5] = new byte[1 * _1MB];
        allocation[6] = new byte[1 * _1MB];
        allocation[7] = new byte[1 * _1MB];
        allocation[8] = new byte[1 * _1MB];
        allocation[8] = new byte[1 * _1MB];
        allocation[9] = new byte[1 * _1MB];
    }

    public static void main(String[] args) {
        testAllocation();
    }

}
