package com.itheima.d5_innerclass_static;

public class Test {
    public static void main(String[] args) {
        //创建内部类
        Outter.Inner in = new Outter.Inner();
        in.setAge(18);
        in.setName("内部类");
        System.out.println(in.getAge());
        in.show();
    }
}