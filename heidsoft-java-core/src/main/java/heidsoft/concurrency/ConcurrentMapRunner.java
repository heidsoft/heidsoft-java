package heidsoft.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author heidsoft
 * 并发map 测试
 */
public class ConcurrentMapRunner {
    public static void main(String[] args) {
        Map<Character, LongAdder> occurances = new Hashtable<>();

        String str = "ABCD ABCD ABCD";
        for(char character:str.toCharArray()){
            LongAdder longAdder = occurances.get(character);
            if(longAdder == null){
                longAdder = new LongAdder();
            }
            longAdder.increment();
            occurances.put(character,longAdder);
        }
        System.out.println(occurances);
    }
}
