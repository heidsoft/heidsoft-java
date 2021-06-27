package heidsoft.nio;

import java.nio.ByteBuffer;

public class DirectByteBufferExample {

    public static void main(String[] args) {
        while (true) {
            ByteBuffer buffer = ByteBuffer.allocateDirect(1024 * 10);

            System.out.println("Is a direct buffer: " + buffer.isDirect());
            System.out.println("Buffer has a backing array: " + buffer.hasArray());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
