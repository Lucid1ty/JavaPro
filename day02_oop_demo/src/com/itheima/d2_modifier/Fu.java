package com.itheima.d2_modifier;

public class Fu {
    /**
     * 定义私有的成员：private 只能在本类中访问
     */
    private void privateMethod(){
        System.out.println("===private===");
    }

    /**
     * 缺省：只能本类，同包下其他类访问（包访问权限）
     */
    void method(){
        System.out.println("===缺省===");
    }

    /**
     *  protected：本类、同包下其他类、其他包的子类中可以访问
     */
    protected void protectedMethod(){
        System.out.println("===protected===");
    }

    /**
     * public：本类、同包下其他类、其他包的子类、其他包的无关类都可以访问
     */
    public void publicMethod(){
        System.out.println("===public===");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
