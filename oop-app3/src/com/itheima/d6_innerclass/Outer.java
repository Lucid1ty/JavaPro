package com.itheima.d6_innerclass;

// 外部类
public class Outer {
    public static int num = 111;
    private String hobby;

    public Outer() {
    }

    public Outer(String hobby) {
        this.hobby = hobby;
    }

    // 成员内部类：不加static修饰 属于外部类对象
    public class Inner{
        private String name;
        private int age;
        public static int a = 100;    // JDK16开始支持在内部类中定义静态成员

        // 静态方法也可以定义
        public static void test(){
            System.out.println("test()方法被调用了");
            System.out.println("内部类中的静态成员a：" + a);
        }
        // 普通方法也可以定义
        public void show(){
            // 可以直接访问外部类实例成员变量
            System.out.println("名称：" + name);
            System.out.println("数量：" + num);
            System.out.println("爱好：" + hobby);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
