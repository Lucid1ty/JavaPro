package com.itheima.d13_system;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始...");
//        System.exit(0);  // JVM 终止,不要使用！

        // 返回从 1970-1-1 00:00:00 走到现在的毫秒值
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("运行时间：" + (endTime - startTime)/1000.0 + "s");

        // 数组拷贝(了解)
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        int[] arr2 = new int[6];
        // 从 arr1 数组下标为 3 的位置开始拷贝，拷到 arr2 数组下标为 2 的位置，一共拷贝 3 个
        System.arraycopy(arr1, 3, arr2,2,3);
        System.out.println(Arrays.toString(arr2));

        System.out.println("程序结束...");
    }
}
