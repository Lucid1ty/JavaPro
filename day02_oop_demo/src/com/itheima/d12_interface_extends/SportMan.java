package com.itheima.d12_interface_extends;

//接口可以多继承：一个接口可以继承多个接口
//规范合并，整合多个接口为同一个接口，便于子类实现！
public interface SportMan extends Law,People{
    void run();
    void competition();
}
