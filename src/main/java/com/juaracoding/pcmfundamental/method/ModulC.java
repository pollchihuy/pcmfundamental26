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
public class ModulC {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        GlobalFunction.printResponse();
       Float floatPenampung = GlobalFunction.printFloat();
    }
}
