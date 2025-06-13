package com.juaracoding.pcmfundamental.oop.modip.lain;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 12/06/2025 21:06
@Last Modified 12/06/2025 21:06
Version 1.0
*/
public class Parent {

    private Integer intValue;

    public Parent(Integer intValue) {
        this.intValue = intValue;
    }

    public Parent() {
        System.out.println("Jalan Dah !!");
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public void printValue() {
        System.out.println(intValue*10);
    }
    void printValue(String s) {
        System.out.println("Nilai Parameter : "+s);
    }
}