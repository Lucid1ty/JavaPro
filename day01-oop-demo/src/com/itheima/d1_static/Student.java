package com.itheima.d1_static;

public class Student {
    /**
     * 实例成员变量：无static修饰，属于对象
     */
    private String name;

    /**
     * 静态成员方法：有static修饰，归属于类，可以被共享访问，用类名或者对象名都可以访问。
     * 通常用来制定一个通用功能的时候我们会使用静态方法
     * @param age1  传入的第一个年龄
     * @param age2  传入的第二个年龄
     * @return  最大的年龄
     */
    public static int getMax(int age1, int age2){
        return age1 > age2 ? age1 : age2;
    }

    /**
     * 实例方法：属于对象，可以直接访问实例变量，只能用对象触发访问。
     */
    public void study(){
        System.out.println(name + "在好好学习！");
    }

    public static void main(String[] args) {
        // 通过类名访问静态方法
        System.out.println(Student.getMax(10, 3));
        // 注意：在同一个类中，访问静态方法，类名可以省略不写。
        // 就像下面这样
        System.out.println(getMax(10, 3));

        // 通过对象访问实例方法
        Student s = new Student();
        s.name = "猪八戒";
        s.study();

        // 通过对象调用静态方法(语法上可以，但不推荐)
        System.out.println(s.getMax(10,3));
    }
}
