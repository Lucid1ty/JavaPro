package com.itheima.d10_extends_constructor;

public class Dog extends Animal{
    public Dog(){
        System.out.println("子类无参数构造器被执行~~");
    }

    public Dog(String name){
        System.out.println("子类有参数构造器被执行~~");
    }

}
