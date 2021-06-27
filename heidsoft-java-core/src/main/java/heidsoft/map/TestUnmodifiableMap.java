package heidsoft.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 测试map对象
 * @author heidsoft
 */
public class TestUnmodifiableMap {
    public static void main(String[] args) {
        Map<Integer,String> books = new HashMap<Integer, String>();
        books.put(1,"java");
        books.put(2,"c++");
        books.put(2,"c");
        Map<Integer,String> unmodifiableMapBooks = Collections.unmodifiableMap(books);
        unmodifiableMapBooks.put(2,"python");
        System.out.print("end");
    }
}
