package heidsoft.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateFileExample2 {

    public static void main(String... args) throws IOException {
        Path dir = Files.createTempDirectory("my-dir");
        Path fileToCreatePath = dir.resolve("test-file.txt");
        Path newFilePath = Files.createFile(fileToCreatePath);
        //creating same file again
        Path newFilePath2 = Files.createFile(newFilePath);
    }
}