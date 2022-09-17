package heidsoft.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 函数式接口，lambda测试
 * 甚至不能把lambda表达式赋给类型为Object的变量，Object不是函数式接口
 * java.util.function包中定义的非常通用的函数式接口
 * {@link java.util.function.Predicate } 条件测试,函数式接口验证使用，e->e=="c++"
 * 基于lambda实现的函数式接口,test(T t) 方法
 * <p>
 * Arrays.asList 返回的并不是java.util.ArrayList，而是java.util.Arrays中的子类
 *
 * @author heidsoft
 */
public class TestLambda04 {
    public static void main(String[] args) {
        var books = new String[]{"java", "golang", "c++", "python"};
        List<String> bookList = new ArrayList<>(Arrays.asList(books));
        System.out.println(bookList);
        bookList.removeIf(e -> e == "c++");
        System.out.println(bookList);
    }
}
