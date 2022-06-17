package com.itheima.d9_api_object;

// 掌握 Object 类中 toString 方法的使用
/*
    Object 类是所有类的父类！
    调用Object 类中的 toString 方法得到对象的地址(调用 Object 类的 toString 方法)
    重写了 toString 方法后，根据就近原则，调用 toString 方法时它会调用重写的 toString 方法
 */
public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("周雄", '男', 19);
        String rs = s.toString();
        System.out.println(rs);  // com.itheima.d9_api_object.Student@776ec8df
        System.out.println(s.toString());   // 直接输出对象变量，默认可以省略 toString 不写
        System.out.println(s);  // 省略了 toString 的写法
    }

}
