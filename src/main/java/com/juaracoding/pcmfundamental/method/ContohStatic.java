package com.juaracoding.pcmfundamental.method;

import com.juaracoding.pcmfundamental.method.tambahan.MethodStatic;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 11/06/2025 21:50
@Last Modified 11/06/2025 21:50
Version 1.0
*/
public class ContohStatic extends MethodStatic {

    public static void main(String[] args) {
        MethodStatic m1 = new MethodStatic();
        System.out.println("Alamat Memory m1 : "+m1);
        m1.getValueX();
        MethodStatic m2 = new MethodStatic();
        System.out.println("Alamat Memory m2 : "+m2);
        m2.getValueX();
        MethodStatic m3 = new MethodStatic();
        System.out.println("Alamat Memory m3 : "+m3);
        m3.getValueX();
    }
}