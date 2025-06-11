package com.juaracoding.pcmfundamental.berbagailogika;

import java.util.Random;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 11/06/2025 20:39
@Last Modified 11/06/2025 20:39
Version 1.0
*/
public class RandomDataPanjang {

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextLong(1000000000000000L,9999999999999999L));
        }
    }
}