package com.java.sar.mains;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.java.sar.util.Common.alert;

public class DateSim {

    public static void main(String[] args) {
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
        Date datenow = new Date();
        alert(datenow);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss a");
        String date = simpleDateFormat.format(new Date(timeStamp));
        String datenowstr = simpleDateFormat.format(datenow);
        alert(date);
        alert(datenowstr);
    }


}
