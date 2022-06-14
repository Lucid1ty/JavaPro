package com.itheima.d6_innerclass;

public class Test {
    public static void main(String[] args) {
        // 创建内部类(无static修饰，内部类被认为是一个对象)对象,通过new.new的方法创建
        Outer.Inner in = new Outer().new Inner();
        in.setName("小明");
        in.show();
        Outer.Inner.test();
        System.out.println("==========================");
        Outer.Inner in1 = new Outer("爱听课").new Inner();
        in1.show();
    }
}
