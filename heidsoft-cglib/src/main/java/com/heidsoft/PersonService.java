package com.heidsoft;

/**
 * @program: heidsoft-java
 * @description: PersonService
 * @author: heidsoft
 * @create: 2018-11-19 19:33
 **/
public class PersonService {
    public String sayHello(String name) {
        return "Hello " + name;
    }

    public Integer lengthOfName(String name) {
        return name.length();
    }
}
