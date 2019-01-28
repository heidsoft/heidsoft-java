package com.heidsoft;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

/**
 * @program: heidsoft-java
 * @description: EnhancerTest
 * @author: heidsoft
 * @create: 2018-11-19 19:37
 **/
public class EnhancerTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        enhancer.setCallback((FixedValue) ()->"hello world");
        PersonService proxy = (PersonService) enhancer.create();
        String res = proxy.sayHello(null);
        System.out.println(res);
    }
}
