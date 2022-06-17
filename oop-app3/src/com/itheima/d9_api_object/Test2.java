package com.itheima.d9_api_object;

// Object 类中 equals 方法的使用
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("周雄", '男', 19);
        Student s2 = new Student("周雄", '男', 19);
        // equals 默认比较对象的地址值
        System.out.println(s1.equals(s2));  // 没有重写 equals 时结果是 false，重写后结果为 true
        System.out.println(s1 == s2);  // false，用 == 号效果和用默认的 equals 方法是一样的
    }
}
