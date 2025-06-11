package com.juaracoding.pcmfundamental.method.tambahan;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 11/06/2025 21:50
@Last Modified 11/06/2025 21:50
Version 1.0
*/
public class MethodStatic {

    static int intX = 0;//com.juaracoding.pcmfundamental.method.tambahan.MethodStatic@72abh3n

    public MethodStatic() {
        intX ++;
        System.out.println("Eksekusi Method Static");
        getValueX();
    }

    public final void getValueX() {
        System.out.println("Nilai intX : "+intX);
    }
}
