package com.itheima.d2_modifier;

public class Test {
    public static void main(String[] args) {
        //权限修饰符的使用
        Fu f = new Fu();
//        f.privateMethod();  //报错：私有的
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
