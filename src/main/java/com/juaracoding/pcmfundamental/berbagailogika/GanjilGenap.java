package com.juaracoding.pcmfundamental.berbagailogika;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 11/06/2025 19:47
@Last Modified 11/06/2025 19:47
Version 1.0
*/
public class GanjilGenap {

    public static void main(String[] args) {
        int intAngka = 11;
        String message = "Angka "+intAngka+" Adalah Bilangan Ganjil";
        if(intAngka % 2 == 0){
            message = "Angka "+intAngka+" Adalah Bilangan Genap";
        }
        System.out.println(message);
    }
}
