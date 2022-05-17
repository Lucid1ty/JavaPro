package com.itheima.d1_static;

public class Test3 {

    /**
     * 静态成员
     */
    public static int onlineNumber = 10;

    /**
     * 实例成员
     */
    private String name;
    private void run(){
        System.out.println(name + "跑得快！");
    }

    public static void test2(){
        System.out.println("===test2===");
    }

    //静态方法中不可以出现this关键字
    public static void test3(){
//        System.out.println(this); //this只能代表当前对象！！！静态方法可以不用对象调用
    }

    //实例方法可以访问静态成员，也可以访问实例成员
    public void go(){
        System.out.println(onlineNumber);
        System.out.println(Test3.onlineNumber);
        test2();

        System.out.println(name);   //访问实例成员
        System.out.println(this);
        run();
    }


    //静态方法只能访问静态成员，不能直接访问实例成员。
    public static void test(){
        System.out.println(onlineNumber);   //直接访问静态成员
        System.out.println(Test3.onlineNumber); //通过类名.成员变量访问（同一个类中，类名可以省略不写）
        test2();
//        System.out.println(name);   //不能直接访问实例成员
//        run();  //同上

    }

    public static void main(String[] args) {
        //目标：理解static   访问相关的语法：面试笔试题，或者以后理解程序很重要的知识（扩展）。
    }
}
