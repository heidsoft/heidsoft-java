package heidsoft.direct;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * https://examples.javacodegeeks.com/core-java/nio/bytebuffer/write-append-to-file-with-byte-buffer/
 */
public class DirectByteBuffersDemo3 {
    public static void main(String[] args) {

        try {

            File inFile = new File("in.txt");

            // Allocate a direct (memory-mapped) byte buffer with a byte capacity equal to file's length
            // DO NOT use this approach for copying large files
            ByteBuffer buf = ByteBuffer.allocateDirect((int)inFile.length());

            InputStream is = new FileInputStream(inFile);

            int b;

            while ((b=is.read())!=-1) {
                Thread.sleep(5000);
                buf.put((byte)b);
            }

            File file = new File("out.txt");

            // append or overwrite the file
            boolean append = false;

            FileChannel channel = new FileOutputStream(file, append).getChannel();

            // Flips this buffer.  The limit is set to the current position and then
            // the position is set to zero.  If the mark is defined then it is discarded.
            buf.flip();

            // Writes a sequence of bytes to this channel from the given buffer.
            channel.write(buf);

            // close the channel
            channel.close();

        }
        catch (IOException | InterruptedException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

    }
}
