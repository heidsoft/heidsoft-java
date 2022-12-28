package heidsoft.stream;

import java.math.BigInteger;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author heidsoft
 * 流对象的创建
 */
public class StreamMethodSample {
    public static void main(String[] args) {
        // 初始化流对象
        Stream<String> words = Stream.of("python", "java", "c++");
        System.out.println(words.count());
        // 不包括任何元素的流
        Stream<String> emptyStream = Stream.empty();
        System.out.println(emptyStream.count());

        Stream<String> echo = Stream.generate(() -> "Echo");
        // 从流中读取数据
        List<String> echoList = echo.limit(2).collect(Collectors.toList());
        for (String echoStr : echoList) {
            System.out.println(echoStr);
        }

        Stream<Double> randoms = Stream.generate(Math::random);
        System.out.println(randoms);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.and(BigInteger.ONE));
        System.out.println(integers.count());
        System.out.println(integers.limit(2));


        Pattern localPattern = Pattern.compile("\\PL+");
        Stream<String> wordsStream = localPattern.splitAsStream("aaaaabbbbbccccc");
        List<String> wordList = wordsStream.limit(2).collect(Collectors.toList());
        for (String word : wordList) {
            System.out.println(word);
        }
    }
}
