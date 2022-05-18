package com.itheima.d7_abstract_test;

public class Test {
    public static void main(String[] args) {
        //抽象类的基本使用：创建父类、被继承、重写抽象方法
        GoldCard c = new GoldCard();
        c.setMoney(10000);
        c.setUserName("小明");
        c.pay(300);
        System.out.println("剩余：" + c.getMoney());
    }
}
