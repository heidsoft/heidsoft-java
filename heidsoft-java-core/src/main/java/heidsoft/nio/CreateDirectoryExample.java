package heidsoft.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 创建目录
 */
public class CreateDirectoryExample {

    public static void main(String... args) throws IOException {
        Path tempPath = Files.createTempDirectory("test");
        Path dirToCreate = tempPath.resolve("test1");
        System.out.println("dir to create: " + dirToCreate);
        System.out.println("dir exits: " + Files.exists(dirToCreate));
        //creating directory
        //设置目录前缀
        Path testPrefixPath = Paths.get("test");
        //二级目录
        Path testpath = testPrefixPath.resolve("path");
        System.out.println("dir to create: " + testpath);
        Path directory = Files.createDirectory(testpath);
        System.out.println("directory created: " + directory);
        System.out.println("dir created exits: " + Files.exists(directory));
    }
}