package com.itheima.d14_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // 精度失真
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b);  // 0.30000000000000004
        // 解决办法：利用 BigDecimal 将 double 类型数据包装成大数对象
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1); // 加法
        BigDecimal c2 = a1.subtract(b1); // 减法
        BigDecimal c3 = a1.multiply(b1); // 乘法
        BigDecimal c4 = a1.divide(b1); // 除法
        System.out.println(c1);  // 0.3
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        // 转回 double 类型
        double rs = c1.doubleValue();
        System.out.println(rs);

        // 注意：BigDecimal 一定要精度运算，如果计算 3/10 会出错
        BigDecimal a11 = BigDecimal.valueOf(10);
        BigDecimal b11 = BigDecimal.valueOf(3);
        // 参数1：除数   参数2：保留几位小数  参数3：舍入模式
        BigDecimal c11 = a11.divide(b11, 2, RoundingMode.HALF_UP);   // Non-terminating decimal expansion; no exact representable decimal result.
        System.out.println(c11);
    }
}
