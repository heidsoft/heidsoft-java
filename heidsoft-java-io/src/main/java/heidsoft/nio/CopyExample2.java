package heidsoft.nio;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * nio 从流中拷贝字节到文件
 */
public class CopyExample2 {

    public static void main(String... args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream("test string".getBytes());
        System.out.println("inputStream bytes available: " + inputStream.available());
        Path target = Paths.get("test/copy-file-test.txt");

        long bytesCopied = Files.copy(
                inputStream,
                target,
                StandardCopyOption.REPLACE_EXISTING
        );
        System.out.println("file copied: " + target);
        System.out.println("copied file exits: " + Files.exists(target));
        System.out.println("bytes copied: " + bytesCopied);
        System.out.println("copied file size: " + Files.size(target));
    }
}