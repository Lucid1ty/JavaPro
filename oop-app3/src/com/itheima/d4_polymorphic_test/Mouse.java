package com.itheima.d4_polymorphic_test;

public class Mouse implements USB{
    private String name;

    public Mouse() {
    }

    public Mouse(String name) {
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
        System.out.println(name + "连接了电脑！");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "从电脑拔出！");
    }

    //独有功能
    public void dbClick(){
        System.out.println(name + "双击了~~");
    }

}
