package com.itheima.d6_extends_test;

public class Test {
    public static void main(String[] args) {
        //目标：理解继承的设计思想
        Student s = new Student();
        s.setName("小明");
        s.setAge(18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.queryCourse();
        s.writeInfo();
    }
}
