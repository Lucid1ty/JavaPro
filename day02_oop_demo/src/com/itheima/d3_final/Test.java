package com.itheima.d3_final;

public class Test {
    public static void main(String[] args) {
        //final的语法
        //1.final修饰类，类不能被继承
        //2.final修饰方法，方法不能被重写

    }
}

// 被final修饰的方法不能重写
// 下面这个是例子
/*
例子：
class Student extends People{
    @Override
    public void eat() {
        System.out.println("学生吃的很多~~");
    }
}

class People{
    public final void eat(){
        System.out.println("人要吃东西！");
    }
}
 */


/*
    final修饰类，类不能被继承
    class Wolf extends Animal{
    }
    final class Animal{
    }
 */
