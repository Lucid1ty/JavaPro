package com.itheima.d6_abstract;

public class Dog extends Animal{
    //一定要完成抽象方法的重写，不然会报错
    @Override
    public void run() {
        System.out.println("狗跑的快！");
    }
}
