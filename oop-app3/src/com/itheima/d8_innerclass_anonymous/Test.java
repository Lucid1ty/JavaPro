package com.itheima.d8_innerclass_anonymous;

// 学习匿名内部类的形式和特点
/*
特点、作用总结
    1.匿名内部类是一个没有名字的内部类
    2.匿名内部类写出来就会产生一个匿名内部类对象
    3.方便创建子类对象，简化代码编写
 */
public class Test {
    public static void main(String[] args) {
        // 之前的写法
//        Animal a = new Tiger();
//        a.run();
        // 现在可以这样写(匿名内部类)
        Animal a = new Animal() {   // 编译看左边，运行看右边
            @Override
            public void run() {
                System.out.println("老虎跑得快！！！");
            }
        };
        a.run();
    }
}


// 老虎(子类)继承动物(父类)
class Tiger extends Animal{
    // 重写 run 方法
    @Override
    public void run() {
        System.out.println("老虎跑得快！");
    }
}


// 抽象的动物类(抽象类不能创建对象)
abstract class Animal{
    public abstract void run();
}
