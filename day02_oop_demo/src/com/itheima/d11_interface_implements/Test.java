package com.itheima.d11_interface_implements;

public class Test {
    public static void main(String[] args) {
        //接口的基本使用：被类实现
        PingPongMan p = new PingPongMan("张继科");
        p.run();
        p.competition();
        p.rule();
    }
}
