package heidsoft.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * nio 方式拷贝文件
 */
public class CopyExample {

    public static void main(String... args) throws IOException {
        Path tempFile = Files.createTempFile("my-file", ".txt");
        System.out.println("file to copy: " + tempFile);
        Path copiedFile = Files.copy(
                tempFile,
                Paths.get("test/" + tempFile.getFileName()),
                StandardCopyOption.REPLACE_EXISTING
        );
        System.out.println("file copied: " + copiedFile);
        System.out.println("copied file exits: " + Files.exists(copiedFile));
    }
}