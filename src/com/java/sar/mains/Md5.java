package com.java.sar.mains;

import java.security.MessageDigest;

public class Md5 {
    public static void main(String[] args) {
        String str = "1";

        alert("原字符：" + str);
        String outs = encode(str);
        alert("密文：" + outs);


    }

    public static String jx(String str) {
        char[] charstr = str.toCharArray();
        String code = "";
        for (int i = 0; i < charstr.length; i++) {
            int j = (int) charstr[i];
            code = j + code;
        }
        return code;
    }

    public static void alert(Object object) {
        System.out.println(object);
    }

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    /**
     * 加密
     *
     * @param str
     * @return
     */
    public static String encode(String str) {
        String strDigest = "";
        try {
            // 此 MessageDigest 类为应用程序提供信息摘要算法的功能，必须用try,catch捕获
            MessageDigest md5 = MessageDigest.getInstance("MD5");

            byte[] data;
            data = md5.digest(str.getBytes("utf-8"));// 转换为MD5码
            strDigest = bytesToHexString(data);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return strDigest;
    }

}