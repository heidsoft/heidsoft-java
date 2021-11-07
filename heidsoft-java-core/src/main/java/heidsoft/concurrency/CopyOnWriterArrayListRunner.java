package heidsoft.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author
 * CopyOnWriteArrayList 测试
 * https://www.youtube.com/watch?v=2Bvz_jsQPHk
 * https://www.cnblogs.com/chengxiao/p/6881974.html
 */
public class CopyOnWriterArrayListRunner {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        list.add("JAVA");
        list.add("C++");
        list.add("Python");

        for (String element : list){

            System.out.println(element + "-" + Thread.currentThread().getName());
        }
    }
}
