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


    /**
     * 自己重写 equals 方法
     * 两个对象中的内容一样则认为是相等的
     */
    @Override
    public boolean equals(Object o){
        // 1.判断传入的 o 是不是学生类型的
        if (o instanceof Student){
            // 将 Object 类型的 o 强制转换为 Student 类型
            Student s2 = (Student) o;
            // 谁调用这个方法，谁就是 this，字符串比较用 equals
//            if (this.name.equals(s2.name) && this.sex == s2.sex && this.age == s2.age){
//                return true;
//            }else {
//                return false;
//            }
            // 上面这堆逻辑写成一行代码：
            return this.name.equals(s2.name) && this.sex == s2.sex && this.age == s2.age;
        }else {
            // 学生只能和学生比较，否则结果一定是 false
            return false;
        }
    }

}
