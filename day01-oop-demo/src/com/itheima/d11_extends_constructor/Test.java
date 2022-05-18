package com.itheima.d11_extends_constructor;

public class Test {
    public static void main(String[] args) {
        //学习子类构造器如何去访问父类有参数构造器，并且清楚其作用
        Teacher t = new Teacher("小明", 18);
        System.out.println(t.getName());
        System.out.println(t.getAge());
    }
}
