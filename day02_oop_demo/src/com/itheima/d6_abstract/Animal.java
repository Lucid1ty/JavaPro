package com.itheima.d6_abstract;

//抽象类：有 abstract 修饰,约定子类要继承并实现抽象方法
public abstract class Animal {
    //抽象方法：有 abstract 修饰不能写方法体代码
    /*
        由于每个子类去实现run()方法时可能都不太一样
        那么这个父类就直接把这个方法声明为抽象的
        让子类自己去实现相关功能
     */
    public abstract void run();
}
