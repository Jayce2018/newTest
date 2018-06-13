package com.java.sar.mains;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static com.java.sar.util.Common.alert;

public class Date {


    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd"); //加上时间
        StringBuilder data = new StringBuilder();
        data.append("2018-10-10 - 2018-11-11");
        String s1 = data.substring(0, 10);
        String s2 = data.substring(13, 23);
        java.util.Date date1 = sDateFormat.parse(s1);
        java.util.Date data2 = sDateFormat.parse(s2);
        alert(date1);
        alert(data2);
    }

}
