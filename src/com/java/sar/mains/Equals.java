package com.java.sar.mains;

import static com.java.sar.util.Common.alert;

public class Equals {


    public static void main(String[] args) {
        String str1 = "hello java!";
        String str2 = "hello idea";

        String str3 = "hello java!";
        String str4 = "hello idea";

        String str5 = new String("my name is java");
        String str6 = new String("my name is java");

        StringBuilder str7 = new StringBuilder("my name is java");

        alert(str5.equals(str6));
        alert(str5 == str6);
    }

}
