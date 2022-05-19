package com.itheima.d13_interface_jdk8;

public interface SportManInter {
    /**
     * JDK 8开始：默认方法（实例方法）
     * 必须default修饰，默认用public修饰
     * 默认方法，接口不能创建对象，这个方法只能过继给了实现类，由实现类的对象调用
     */
    //public可以省略不写
    public default void run(){
        System.out.println("跑的很快~~~");
        go();   //调用内部私有方法
    }
    /**
     * 静态方法
     * 必须使用 static 修饰，默认用 public 修饰
     */
    public static void inAddr(){
        System.out.println("我们都在学习Java新增方法的语法，它是Java源码自己会用到的~~~");
    }
    /**
     * 私有方法（实例方法）
     * JDK 1.9 开始才支持的
     * 必须在接口内部才能访问
     */
    private void go(){
        System.out.println("开始跑~~");
    }

}

class PingPongMan implements SportManInter{
}

class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();
        SportManInter.inAddr();

    }
}





