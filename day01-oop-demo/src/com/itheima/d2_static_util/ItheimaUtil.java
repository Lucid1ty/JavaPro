package com.itheima.d2_static_util;

import java.util.Random;

/**
 * 工具类
 */
public class ItheimaUtil {
    /**
     * 静态方法
     */
    public static String createVerifyCode(int n){
        //开发一个验证码功能
        //1.定义一个变量记录验证码
        String code = "";
        //2.定义一个变量存储全部验证码字符
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //3.定义一个循环生成几个随机索引，去得到几个字符串
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //获取随机索引对应的字符，连接给code
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
//        System.out.println("验证码："+ code);
        return code;
    }

}
