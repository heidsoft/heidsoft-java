package com.heidsoft.hello;

/**
 * heidsoft-java git:(master) ✗ javac heidsoft.hellomod/module-info.java heidsoft.hellomod/com/heidsoft/hello/HelloWorld.java
 * ➜  heidsoft-java git:(master) ✗ javac --version
 * javac 17
 * ➜  heidsoft-java git:(master) ✗ java --module-path heidsoft.hellomod --module heidsoft.hellomod/com.heidsoft.hello.HelloWorld
 * hello world mod
 * ➜  heidsoft-java git:(master) ✗
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world mod");
    }
}