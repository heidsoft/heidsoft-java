package heidsoft.direct;

import java.nio.ByteBuffer;

/**
 * https://www.cnblogs.com/JAYIT/p/8384476.html
 */
public class DirectByteBuffersDemo1 {
    public static void main(String[] args) {
        System.out.println("----------Test allocate--------");
        System.out.println("before alocate:" + Runtime.getRuntime().maxMemory()/1024/1024);

        // 如果分配的内存过小，调用Runtime.getRuntime().freeMemory()大小不会变化？
        // 要超过多少内存大小JVM才能感觉到？
        int one_mb=1024;
        ByteBuffer buffer = ByteBuffer.allocate(one_mb*10);
        System.out.println("buffer = " + buffer);

        System.out.println("after alocate:"+ Runtime.getRuntime().freeMemory()/1024/1024);

        // 这部分直接用的系统内存，所以对JVM的内存没有影响
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(10240000);
        System.out.println("directBuffer = " + directBuffer);
        System.out.println("after direct alocate:" + Runtime.getRuntime().freeMemory()/1024/1024);

        System.out.println("----------Test wrap--------");
        byte[] bytes = new byte[32];
        buffer = ByteBuffer.wrap(bytes);
        System.out.println(buffer);

        buffer = ByteBuffer.wrap(bytes, 10, 10);
        System.out.println(buffer);
    }
}
