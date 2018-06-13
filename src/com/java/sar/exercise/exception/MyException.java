package com.java.sar.exercise.exception;

import static com.java.sar.util.Common.alert;

public class MyException {
    private static int plus(int n1, int n2) throws Exception {
        int s = n1 + n2;
        return s;
    }

    public static void main(String[] args) throws Exception {
        int n1 = 1, n2 = 3;

        alert(plus(n1, n2));
    }
}
