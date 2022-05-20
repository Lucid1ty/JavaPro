package com.itheima.d4_polymorphic_test;
//实现类
public class KeyBoard implements USB{
    private String name;

    public KeyBoard() {
    }

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "已成功连接电脑！");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "已从电脑拔出！");
    }

    //独有方法
    public void keyDown(){
        System.out.println(name + "敲击了：666~~~");
    }


}
