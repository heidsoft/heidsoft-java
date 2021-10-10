package heidsoft.direct;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * https://www.cnblogs.com/JAYIT/p/8384476.html
 */
public class DirectByteBuffersDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("----------Test allocate--------");
        System.out.println("before alocate:" + Runtime.getRuntime().maxMemory()/1024/1024);
        Path path = Paths.get("test.txt");
        FileChannel fileChannel = null;
        try{
            fileChannel = FileChannel.open(path,StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
            while (true){
                // 这部分直接用的系统内存，所以对JVM的内存没有影响
                System.out.println("test alocate ...");
                Thread.sleep(5000);
                ByteBuffer directBuffer = ByteBuffer.allocateDirect(1024);
                directBuffer.putInt(1);
                fileChannel.write(directBuffer);
                System.out.println("directBuffer = " + directBuffer);
                System.out.println("after direct alocate:" + Runtime.getRuntime().freeMemory()/1024/1024);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {

        }

    }
}
