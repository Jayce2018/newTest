package com.java.sar.mains;

public enum Test {
    sunjiang("宋江", 34, "m"),
    diaochan("貂蝉", 23, "f");

    private String name, gender;
    private int age;


    private Test(String name, int age, String gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public static void ptf(Test man) {
        String gender, san;
        if (man.gender == "m") {
            gender = "boy";
            san = "he";
        } else {
            gender = "gilr";
            san = "she";
        }
        System.out.println(man.name + " is a " + gender + "," + san + " is " + man.age + " years old!");
    }

    public static void main(String[] args) {
        ptf(sunjiang);
        ptf(diaochan);

    }


}