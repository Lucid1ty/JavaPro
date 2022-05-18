package com.itheima.d3_final;

public class Test2 {
    //修饰静态成员变量：常量
    public static final String schoolName = "黑马";

    //修饰实例成员变量：几乎不用！！！
    private final String name = "小明";

    public static void main(String[] args) {
        //final修饰变量的作用：该变量只能被赋值一次
        //局部变量
        final double rate = 3.14;
//    rate = 3.11;  第二次赋值了
        buy(0.2);   //给z第一次赋值
    }

    public static void buy(final double z){
//        z = 0.1;    给z第二次赋值了
    }

    //final修饰基本数据类型：值无法改变
    //final修饰引用数据类型，地址无法改变，但是指向的对象中的内容可以改变


}

class Teacher{
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
