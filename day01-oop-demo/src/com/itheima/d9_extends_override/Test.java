package com.itheima.d9_extends_override;

public class Test {
    public static void main(String[] args) {
        //认识方法重写
        //1.静态方法不能被重写
        //2.private修饰的方法不能被重写
        //3.子类重写方法时，权限必须大于等于父类方法
        newPhone hw = new newPhone();
        hw.call();
        hw.sendMas();
    }
}

// 子类
class newPhone extends phone{
    //重写的方法
    @Override   //1.重写校验注解，加上后会校验你的重写是否正确，这样更安全 2.提高可读性，优雅！
    public void call(){
        super.call();
        System.out.println("视频通话~~");
    }

    //重写的方法
    @Override
    public void sendMas(){
        super.sendMas();
        System.out.println("发送有趣的图片~~");
    }
}

// 父类
class phone {
    public void call(){
        System.out.println("打电话~~");
    }

    public void sendMas(){
        System.out.println("发信息~~");
    }
}


