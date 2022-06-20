package com.itheima.d12_math;


public class MathDemo {
    public static void main(String[] args) {
        // 返回绝对值
        System.out.println(Math.abs(10.3));
        System.out.println(Math.abs(-10.3));

        // 向上取整
        System.out.println(Math.ceil(4.0000001));
        System.out.println(Math.ceil(4.0));

        // 向下取整
        System.out.println(Math.floor(4.9999999999));
        System.out.println(Math.floor(5.0));

        // 指数求次方
        System.out.println(Math.pow(2, 3));  // 2 的 3 次方

        // 四舍五入
        System.out.println(Math.round(4.499999999));
        System.out.println(Math.round(4.50000000001));

        // 随机数(0.0 到 1.0)(包前不包后)
        System.out.println(Math.random());  // 0.0 - 1.0

        // 利用 Math.random() 获取自己想要的随机数范围
        // 例子：获取 3 - 9 之间的随机数(整数)
        // 减加法
        // 乘以 7 之后用int截断得到 [0,6] 再加 3
        System.out.println((int)(Math.random() * 7) + 3);
    }
}
