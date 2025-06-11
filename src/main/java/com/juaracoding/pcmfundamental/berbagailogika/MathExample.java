package com.juaracoding.pcmfundamental.berbagailogika;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 11/06/2025 20:45
@Last Modified 11/06/2025 20:45
Version 1.0
*/
public class MathExample {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(2));
        System.out.println(Math.pow(3,2));
        /** Pembulatan */
        System.out.println(Math.ceil(4.00001));
        System.out.println(Math.floor(4.99999));
        System.out.println(Math.round(4.45555));
        System.out.println(Math.round(4.51111));

        System.out.println(1000389.1212);
        System.out.println(1000390);
//        System.out.println(1001000);

        System.out.println("Floor Precision Error "+Math.floor(4.9999999999999999));
        System.out.println("Floor Precision Error "+Math.ceil(5.0000000000000001));
    }
}
