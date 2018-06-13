package com.java.sar.mains;

import com.alibaba.fastjson.JSONObject;


public class JsonTest {

    private static void test() {
        System.out.println("json字符串转java代码");
        String jsonStr = "{\"password\":\"123456\",\"username\":\"张三\"}";
        JSONObject jsonObj = JSONObject.parseObject(jsonStr);
        String username = jsonObj.getString("username");
        String password = jsonObj.getString("password");
        System.out.println("json--->java\n username=" + username
                + "\t password=" + password);
    }

    public static void main(String[] args) {
        test();
    }

}
