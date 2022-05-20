package com.itheima.d5_innerclass_static;

//外部类
public class Outter {
    //静态成员内部类（和普通类没区别）
    public static int a = 100;
    //不能访问实例成员
    private String hobby;
    public static class Inner{
        private int age;
        private String name;
        public static String schoolName;

        public void show(){
            System.out.println("名称：" + name);
            //可以访问外部类的公开静态成员变量
            System.out.println(a);
//            System.out.println(hobby);    报错
            Outter o = new Outter();
            //只能通过对象去访问
            System.out.println(o.hobby);
        }
        public Inner() {
        }

        public Inner(int age) {
            this.age = age;
        }

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