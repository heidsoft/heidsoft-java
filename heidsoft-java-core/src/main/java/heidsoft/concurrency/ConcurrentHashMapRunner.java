package heidsoft.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author heidsoft
 * 并发map 测试
 */
public class ConcurrentHashMapRunner {
    public static void main(String[] args) {
        ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();

        String str = "ABCD ABCD ABCD";
        for(char character:str.toCharArray()){
            occurances.computeIfAbsent(character,ch-> new LongAdder()).increment();
        }
        System.out.println(occurances);
    }
}
