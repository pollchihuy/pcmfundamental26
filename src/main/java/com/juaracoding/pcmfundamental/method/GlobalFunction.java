package com.juaracoding.pcmfundamental.method;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 11/06/2025 21:24
@Last Modified 11/06/2025 21:24
Version 1.0
*/
public class GlobalFunction {


    public static void printResponse(){
        System.out.println("Successfully Saved");
        methodPanggilan();
    }

    public static Float printFloat(){
        return 10f;
    }

    public static void methodPanggilan(){
        System.out.println("Ehhh dipanggil .... ");
    }
}
