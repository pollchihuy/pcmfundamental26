package com.juaracoding.pcmfundamental.berbagailogika;

import java.util.Random;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 11/06/2025 20:15
@Last Modified 11/06/2025 20:15
Version 1.0
*/
public class RandomExample {

    public static void main(String[] args) {
        // saya mau random 0-100
        Random rand = new Random();
        String strArr[] = {"Achmadi","Satria","Kevin","Taufik","Ricky"};

        for (int i = 0; i < 10; i++) {
            System.out.println(strArr[rand.nextInt(strArr.length)]);
        }
    }
}
