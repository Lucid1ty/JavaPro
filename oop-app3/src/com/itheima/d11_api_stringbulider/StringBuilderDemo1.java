package com.itheima.d11_api_stringbulider;

// 学会使用 StringBuilder 来操作字符串，最终知道他性能好的原因
// StringBuilder 效率高的原因：只在堆内存中产生一个对象
// 而普通的字符串拼接方法(字符串是不可变的)需要不断产生新对象、同时也在丢弃对象，非常浪费性能
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();  // 相等于 ""
        // 什么都能拼接
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append(1);
        sb.append(false);
        sb.append(3.3);
        sb.append("abc");
        System.out.println(sb);  // 打印的是内容

        StringBuilder sb1 = new StringBuilder();
        // 支持链式编程
        sb1.append("a").append("b").append("c").append("我爱你中国");
        System.out.println(sb1);

        // 反转
        sb1.reverse().append("110");
        System.out.println(sb1);

        // 取字符串长度
        System.out.println(sb1.length());

        // StringBulider 只是拼接字符串的手段，效率好
        // 最终还是要恢复成字符串
        StringBuilder sb2 = new StringBuilder();
        sb2.append("123").append("456");
        // 恢复成字符串
        String rs = sb2.toString();
        System.out.println(rs);
        check(rs);
    }
    public static void check(String data){
        System.out.println(data);
    }
}
