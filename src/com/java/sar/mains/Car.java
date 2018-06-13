package com.java.sar.mains;

import static com.java.sar.util.Common.alert;

public enum Car {
    hanma(10), baoma(8), sanling(7), F1(8);

    private int type;

    Car(int type) {
        this.type = type;
    }

    public static void main(String[] args) {
        alert(Car.values()[0].type);
    }
}
