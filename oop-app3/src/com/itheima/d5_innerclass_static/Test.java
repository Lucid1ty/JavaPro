package com.itheima.d5_innerclass_static;

public class Test {
    public static void main(String[] args) {
        //创建内部类对象
        Outer.Inner in = new Outer.Inner(); // 通过“外部类.内部类”来创建
        in.setAge(18);
        in.setName("内部类");
        System.out.println("age：" + in.getAge());
        in.show();
    }
}
