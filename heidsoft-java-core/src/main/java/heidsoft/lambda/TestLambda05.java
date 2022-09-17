package heidsoft.lambda;

import java.time.LocalDate;
import java.util.Objects;

/**
 * 函数式接口，lambda测试
 * 甚至不能把lambda表达式赋给类型为Object的变量，Object不是函数式接口
 * java.util.function包中定义的非常通用的函数式接口
 * {@link java.util.function.Predicate 条件测试} 函数式子，接口验证使用，e->e=="c++"
 * 基于lambda实现的函数式接口,test(T t) 方法
 * Arrays.asList 返回的并不是java.util.ArrayList，而是java.util.Arrays中的子类
 * 供应商没有参数，调用时生产一个T类型的值，供应者用于实现懒计算 {@link java.util.function.Supplier}
 *
 * @author heidsoft
 */
public class TestLambda05 {
    public static void main(String[] args) {
        String day = null;
        /**
         * requireNonNullElseGet 方法只在需要值时才调用供应者
         */
        LocalDate hireDay = (LocalDate) Objects.requireNonNullElseGet(day,
                () -> LocalDate.of(2022, 9, 17));
        System.out.println(hireDay);
    }
}
