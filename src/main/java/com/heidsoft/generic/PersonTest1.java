package com.heidsoft.generic;

/**
 * 定一个泛型对象，并测试
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person<String> person = new Person<>("刘","彬");
        System.out.println(  person.getFistName() );
        System.out.println(  person.getLastName() );

        String[] words = {"Shenzhen","Beijing","Shanghai"};
    }
}
