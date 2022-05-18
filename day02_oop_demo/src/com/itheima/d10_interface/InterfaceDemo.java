package com.itheima.d10_interface;

//声明了一个接口：体现了一种规范（一定是公开的）
public interface InterfaceDemo {
    //接口中的成分特点：JDK1.8之前接口中只能有抽象方法和常量
//    public static final String SCHOOL_NAME = "黑马程序员";
    String SCHOOL_NAME = "黑马程序员";

    //抽象方法
    //注意：由于接口体现规范思想，规范默认是公开的，所以代码层面，public abstract 可以省略不写
//    public abstract void run();
    void run();
//    public abstract void eat();
    void eat();
}
