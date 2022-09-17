package heidsoft.lambda;

import java.util.function.BiFunction;

/**
 * 函数式接口，lambda测试
 * 甚至不能把lambda表达式赋给类型为Object的变量，Object不是函数式接口
 * java.util.function包中定义的非常通用的函数式接口
 *
 * @author heidsoft
 */
public class TestLambda03 {
    public static void main(String[] args) {
        /**
         * BiFunction<T,U,R> 描述参数类型为T和U，返回类型为R的函数
         */
        BiFunction<String, String, Integer> com = (first, second) -> first.length() - second.length();

        /**
         * 应用这两个函数
         * @return 输出函数计算结果
         */
        System.out.println(com.apply("java", "c++"));

    }
}
