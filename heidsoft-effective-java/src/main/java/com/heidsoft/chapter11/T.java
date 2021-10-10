package com.heidsoft.chapter11;

/**
 * 每个栈帧内部都包含一组称为局部变量表的变量列表，局部变量表的大小在编译期间就已经确定，对应 class 文件中方法 Code 属性的 locals 字段，Java 虚拟机会根据 locals 字段来分配方法执行过程中需要分配的最大的局部变量表容量。代码示例如下。
 *
 * ————————————————
 * 原文作者：LZC
 * 转自链接：https://learnku.com/articles/48678
 * 版权声明：著作权归作者所有。商业转载请联系作者获得授权，非商业转载请保留以上作者信息和原文链接。
 */
public class T {
    public int addFun(int a, int b) {
        return a+b;
    }
}