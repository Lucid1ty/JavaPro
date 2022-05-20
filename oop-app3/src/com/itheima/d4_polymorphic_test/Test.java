package com.itheima.d4_polymorphic_test;

/**
 * 目标：USB设备模拟
 * 1.定义USB接口：接入 拔出
 * 2.定义2个USB的实现类：鼠标、键盘
 * 3.创建一个电脑对象，创建USB设备对象，安装启动
 */
public class Test {
    public static void main(String[] args) {
        //创建电脑对象
        Computer c = new Computer("外星人");
        c.start();
        //创建键盘对象
        USB u = new KeyBoard("罗技键盘");
//        KeyBoard k = new KeyBoard();  这样写也可以
        c.installUSB(u);
        //创建鼠标对象
        USB u1 = new Mouse("罗技鼠标");
        System.out.println("==================");
        c.installUSB(u1);
    }
}
