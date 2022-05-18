package com.itheima.d8_extends_field_method;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();    //就近原则：当这个方法子类和父类都有的时候，优先调用子类的方法
        d.lookDoor();
        d.showName();
    }
}

class Animal{
    public String name = "动物名";
    public void run(){
        System.out.println("动物可以跑~~");
    }
}

class Dog extends Animal{
    public String name = "狗名";
    public void showName(){
        String name = "局部名";
        System.out.println(name);
        System.out.println(this.name);  //当前子类对象的name
        System.out.println(super.name); //访问父类空间中的name
        run();  //子类的
        super.run();    //父类的
    }

    public void run(){
        System.out.println("狗跑的很快！");
    }

    public void lookDoor(){
        System.out.println("狗可以看门");
    }
}
