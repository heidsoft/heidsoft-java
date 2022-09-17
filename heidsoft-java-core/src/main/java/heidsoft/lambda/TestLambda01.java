package heidsoft.lambda;

import java.util.Arrays;

/**
 * 函数式接口，lambda测试
 *
 * @author heidsoft
 */
public class TestLambda01 {
    public static void main(String[] args) {
        var books = new String[]{"java", "python", "golang", "c++"};
        //int test =   (String first,String second)->first.length()-second.length()
        Arrays.sort(books, (String first, String second) -> first.length() - second.length());
        System.out.println(Arrays.toString(books));
    }
}
