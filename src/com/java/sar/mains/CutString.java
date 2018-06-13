package com.java.sar.mains;

import static com.java.sar.util.Common.alert;

public class CutString {
    public static void main(String[] args) {
        String dataBt = "0000-00-00 - 6666-66-66";
        String[] arr = dataBt.split(" - ");
        String dataS = null, dataE = null;
        dataS = (arr.length > 0) ? arr[0] : "null";
        dataE = (arr.length > 0) ? arr[1] : "null";
        alert(dataS);
        alert(dataE);
    }

}
