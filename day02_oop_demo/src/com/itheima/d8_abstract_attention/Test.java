package com.itheima.d8_abstract_attention;

public class Test {
    public static void main(String[] args) {
        //理解抽象类的特征和注意事项
        //1.类有的东西，抽象类都有
        //2.抽象类中可以没有抽象方法，但是有抽象方法的必须是抽象类
        //3.一个类继承了抽象类，那么它必须完成全部抽象方法的重写，否则这个类也必须定义成抽象类，不然报错
        //4.抽象类不能创建对象
//        Animal a = new Animal();  报错
        Cat c = new Cat();
        c.eat();
        c.run();
    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫在吃东西~~");
    }

    @Override
    public void run() {
        System.out.println("猫在跑~~");
    }
}

abstract class Animal{
    public abstract void eat();
    public abstract void run();
}
