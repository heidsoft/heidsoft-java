package com.heidsoft.aop;

/**
 * @program: heidsoft-java
 * @description:
 * @author: heidsoft
 * @create: 2018-11-20 13:49
 **/
public aspect TxAspect
{
    // 指定执行 Hello.sayHello() 方法时执行下面代码块
    void around():call(void Hello.sayHello()){
            System.out.println("开始事务 ...");
            proceed();
            System.out.println("事务结束 ...");
    }
}