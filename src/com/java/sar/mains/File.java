package com.java.sar.mains;

import java.io.*;

import static com.java.sar.util.Common.alert;

public class File {
    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("e://test.txt", true));
        out.write("你是谁\n");
        out.close();

        BufferedReader reader = new BufferedReader(new FileReader("e://test.txt"));
        String str;
        while (null != (str = reader.readLine()))
            alert(str);
        alert("反馈：操作成功！");
    }
}
