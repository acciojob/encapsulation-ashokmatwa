package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // name has private access in com.driver.RWOnly
//        obj.name = "Ashok";
//        System.out.println(obj.name);

        obj.setName("Ashok"); //setter function called
        System.out.println(obj.getName()); //getter function called
    }
}
