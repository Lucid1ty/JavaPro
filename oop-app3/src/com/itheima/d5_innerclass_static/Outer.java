package com.itheima.d5_innerclass_static;

//外部类
public class Outer {
    // 内部类可以直接访问外部类的公开静态成员变量a
    public static int a = 100;
    // 内部类不能直接访问实例成员hobby
    private String hobby;
    // 创建内部类
    public static class Inner{
        // 内部类
        // 静态成员内部类(和普通类没区别,只是位置在里面)
        private String name;
        private int age;
        public static String schoolName;

        // 内部类的show()方法
        public void show(){
            System.out.println("正在调用show()方法==================");
            System.out.println("名称：" + name);
            // 可以访问外部类的公开静态成员变量
            System.out.println("外部类的公开静态成员变量a：" + a);
//            System.out.println(hobby);    直接访问外部类实例成员变量报错
            // 内部类只能通过创建对象的方法去访问外部类实例成员变量
            Outer o = new Outer();
            System.out.print("内部类通过创建对象的方法访问外部类实例成员变量hobby：");
            System.out.println(o.hobby);
            System.out.println("show()方法调用完毕==================");
        }
        // 无参构造器
        public Inner() {}
        // 有参构造器
        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }
        // get set 方法
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }
    }
}
