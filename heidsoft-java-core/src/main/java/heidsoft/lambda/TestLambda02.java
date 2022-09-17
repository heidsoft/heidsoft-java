package heidsoft.lambda;

import javax.swing.*;

/**
 * 函数式接口，lambda测试
 * 甚至不能把lambda表达式赋给类型为Object的变量，Object不是函数式接口
 *
 * @author heidsoft
 */
public class TestLambda02 {
    public static void main(String[] args) {
        var timer = new Timer(1000, events -> {
            System.out.println("events");
        });
        timer.start();
    }
}
