package com.example.shirodemo.utils;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyMD5 {
    private static MessageDigest md5 = null;
    private static BASE64Encoder base64Encoder = null;

    public MyMD5() {
    }

    /**
     * 加密
     * @param str 加密字符
     * @param salt 加盐
     * @return
     */
    public static String enCription(String str, String salt) {
        str = str + salt;
        byte[] bytes = str.getBytes();
        md5.update(bytes);
        return base64Encoder.encode(md5.digest());
    }

    public static void main(String[] args) {
        MyMD5 mm = new MyMD5();
        System.out.println(enCription("123456", "123"));
    }

    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
            base64Encoder = new BASE64Encoder();
        } catch (NoSuchAlgorithmException var1) {
            var1.printStackTrace();
        }

    }
}
