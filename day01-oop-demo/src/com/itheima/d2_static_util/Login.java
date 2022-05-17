package com.itheima.d2_static_util;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        //调用验证码功能
        System.out.println(ItheimaUtil.createVerifyCode(6));
    }
}
