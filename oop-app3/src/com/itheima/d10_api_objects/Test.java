package com.itheima.d10_api_objects;

import java.util.Objects;

// 掌握 Objects 类中的常用方法:equals
public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("itheima");
        // 对于字符串来说，使用 equals 方法判断的是内容是否相等(不再判断地址值)
        // 如果 s1 为 null，那么下面这行代码运行会报错(空指针异常)
//        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));  // 这样写，遇到空指针就不会报错了！(更安全，结果准确)
        // 判断是否为 null
        System.out.println(Objects.isNull(s1));  // true
        System.out.println(Objects.isNull(s2));  // false
        // 下面是等价的写法
        System.out.println(s1 == null);  // true
        System.out.println(s2 == null);  // false
    }
}
