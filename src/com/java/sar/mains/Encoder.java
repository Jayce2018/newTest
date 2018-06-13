package com.java.sar.mains;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import static com.java.sar.util.Common.alert;

public class Encoder {
    private static String str = "http://www.4399.com";
    private static String font = "书法";

    public static void main(String[] args) throws UnsupportedEncodingException {
        alert(font);

        String str1 = URLEncoder.encode(font, "UTF-8");
        alert(str1);
        alert(java.net.URLDecoder.decode(str1, "UTF-8"));
    }
}
