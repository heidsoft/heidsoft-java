package heidsoft.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * nio 创建文件方式
 */
public class CreateFileExample {
    public static void main(String[] args) throws IOException {
        Path dir = Files.createTempDirectory("my-dir");
        Path fileToCreatePath = dir.resolve("test-file.txt");
        System.out.println("File to create path: " + fileToCreatePath);
        Path newFilePath = Files.createFile(fileToCreatePath);
        System.out.println("New file created: " + newFilePath);
        System.out.println("New File exits: " + Files.exists(newFilePath));
    }
}
