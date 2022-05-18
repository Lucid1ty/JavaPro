package com.itheima.d9_abstract_template;

public class Test {
    public static void main(String[] args) {
        //理解模板方法的思想和使用步骤
        StudentMiddle sm = new StudentMiddle();
        sm.write();
        StudentChild sc = new StudentChild();
        sc.write();
    }
}
