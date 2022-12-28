package heidsoft.stream;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author heidsoft
 * java8 流库使用测试
 */
public class CountLongWords {
    public static void main(String[] args) throws java.io.IOException {
        var contents = new String(Files.readAllBytes(Paths.
                get("/Users/heidsoft/Downloads/openjdk-download-instructions.txt")),
                StandardCharsets.UTF_8);
//        https://www.regular-expressions.info/unicode.html#prop
//        In addition to the standard notation, \p{L}, Java, Perl, PCRE, the JGsoft engine, and XRegExp 3 allow you to use the shorthand \pL.
//        The shorthand only works with single-letter Unicode properties. \pLl is not the equivalent of \p{Ll}.
//        It is the equivalent of \p{L}l which matches Al or àl or any Unicode letter followed by a literal l.
//        除了标准符号外，\p{L}、Java、Perl、PCRE、JGsoft 引擎和 XRegExp 3 还允许您使用简写 \pL。简写仅适用于单字母 Unicode 属性。
//        \pLl 不等同于 \p{Ll}。它等价于 \p{L}l，匹配 Al 或 àl 或任何 Unicode 字母后跟文字 l。
        List<String> words = List.of(contents.split("\\PL"));
        // for 循环统计
        long count = 0;
        for (String w : words) {
            if (w.length() > 5) {
                count++;
            }
        }
        System.out.println(count);

        // 基于流方式统计
        // filter 中是条件表达式
        //
        System.out.println(System.currentTimeMillis());
        count = words.stream().filter(w -> w.length() > 5).count();
        System.out.println(count);

        count = words.parallelStream().filter(w -> w.length() > 5).count();
        System.out.println(count);
    }
}
