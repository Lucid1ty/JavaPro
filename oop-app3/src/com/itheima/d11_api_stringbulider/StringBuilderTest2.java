package com.itheima.d11_api_stringbulider;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = null;
        int[] arr2 = {};
        System.out.println(toString(arr));
        System.out.println(toString(arr1));
        System.out.println(toString(arr2));
    }
    /**
     * 定义方法接受整型数组，然后返回数组内容
     */
    public static String toString(int[] arr){
        if (arr != null){
            // 开始拼接
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
                if (i < arr.length - 1){
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }else {
            return null;
        }
    }
}
