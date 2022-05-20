package com.itheima.d4_polymorphic_test;

public class Computer {
    private String name;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //电脑开机
    public void start(){
        System.out.println(name + "电脑开机了~~");
    }
    //提供安装USB设备的入口
    //把USB类型的设备送进来
    public void installUSB(USB usb){
        //多态：这个送进来的usb可能是鼠标也可能是键盘
        usb.connect();
        //独有功能：先判断再强转
        if (usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        } else if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.dbClick();
        }
        usb.unconnect();
    }
}
