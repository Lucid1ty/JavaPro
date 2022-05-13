package com.itheima.d1_static;

public class User {
    /*
        在线人数
        注意:static修饰的成员变量:静态成员变量,只在内存中有一份,可以被共享
     */
    public static int onlineNumber = 161;   // 在开发中可以用来存储在线人数之类的数据(可以被共享访问)
    // 实例成员变量：无static修饰，属于每一个对象，必须用对象名.访问
    private String name;
    private int age;


    public static void main(String[] args) {
        // 理解static修饰成员变量的作用和访问特点
        // 1.通过：类名.静态成员变量访问(推荐)
        System.out.println(User.onlineNumber);
        // 2.通过:对象.静态成员变量访问(不推荐)
        // System.out.println(User.name);    // 报错
        User u = new User();
        u.name = "张三";
        u.age = 21;
        System.out.println(u.name);
        System.out.println(u.age);
        u.onlineNumber++;   //新来了一个人
        System.out.println(u.onlineNumber); // 不推荐

        User u2 = new User();
        u2.name = "李四";
        u2.age = 22;
        System.out.println(u2.name);
        System.out.println(u2.age);
        u.onlineNumber++;   //新来了一个人
        System.out.println(u.onlineNumber); // 不推荐
        System.out.println(User.onlineNumber);  // 推荐
        System.out.println(onlineNumber);   // 注意：在同一个类中静态成员变量的访问可以省略类名
    }
}
