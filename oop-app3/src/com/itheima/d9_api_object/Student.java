package com.itheima.d9_api_object;

public class Student {
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重写了 toString 方法后，根据就近原则，调用 toString 方法时它会调用这里的重写方法
//    @Override
//    public String toString(){
//        return "Student{name=" + name + ", sex=" + sex + ", age=" + age + "}";
//    }

    // 使用：右键-->Generate...-->toString 自动生成
    // 快捷键：Alt + Insert
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", sex=" + sex +
//                ", age=" + age +
//                '}';
//    }

    // 快捷代码提示：输入tos,选择好后按两下回车
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }



}
