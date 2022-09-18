package heidsoft.lambda;

import javax.swing.*;

/**
 * 函数式接口，lambda测试
 * 甚至不能把lambda表达式赋给类型为Object的变量，Object不是函数式接口
 * java.util.function包中定义的非常通用的函数式接口
 * {@link java.util.function.Predicate 条件测试} 函数式子，接口验证使用，e->e=="c++"
 * 基于lambda实现的函数式接口,test(T t) 方法
 * Arrays.asList 返回的并不是java.util.ArrayList，而是java.util.Arrays中的子类
 * 供应商没有参数，调用时生产一个T类型的值，供应者用于实现懒计算 {@link java.util.function.Supplier}
 * 方法引用
 * <p>
 * object::instanceMethod  方法引用等价于向方法传递参数的lambda表达式
 * 例如：System.out::println, 对象是System.out，方法表达式等价于x-> System.out.println(x)
 * Class::instanceMethod  第一个参数会成为隐式参数
 * 例如，String::compareToIgnoreCase 等同于(x,y)->compareToIgnoreCase(y)
 * Class::staticMethod  所有参数都传递到静态方法
 * 例如： Math::pow 等价于(x,y)->Math.pow(x,y)
 *
 * 如果有多个不同名的重载方法，编译器就会尝试从上下文中找出你指的是哪一个方法。
 * 例如，Math.max方法有两个版本，一个用于整数，一个用于double值。选择哪一个版本取决于Math::max转换为
 * 哪个函数式接口的方法参数。
 * 方法引用不能独立存在，总是会转换为函数式的实例。
 *
 * @author heidsoft
 */
public class TestLambda07 {
    public static void main(String[] args) {
        var timer = new Timer(1000, e -> System.out.println(e));
        timer.start();

        /**
         * 表达式System.out::println 是一个方法引用（metho reference），它指示编译器生成一个函数式
         * 接口的实例，覆盖合格接口的抽象方法来调用给定的方法。
         */
        var timer2 = new Timer(1000, System.out::println);
        timer2.start();
    }
}
