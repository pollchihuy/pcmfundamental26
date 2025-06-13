package com.juaracoding.pcmfundamental.oop;

import com.juaracoding.pcmfundamental.oop.contohabstract.KelasAbstract;
import com.juaracoding.pcmfundamental.oop.modip.Child2;
import com.juaracoding.pcmfundamental.oop.modip.lain.Parent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 13/06/2025 19:20
@Last Modified 13/06/2025 19:20
Version 1.0
*/
public class ImplementPolimorph {

    public static void main(String[] args) {
        ContohOverload c = new ContohOverload();
        c.hitung("x");
        c.hitung(1);
        c.hitung(1.0);

        System.out.println(1);
        System.out.println("1");
        System.out.println(1.0);
        System.out.println(true);
        System.out.println(new Object());

        String strX = "Welcome";
        System.out.println(strX.substring(3));
        System.out.println(strX.substring(3,5));
        //8999

//        Child2 p = new Child2();
//        p.printValue("Ini !!");

//        List list = new ArrayList<String>();
//        List listLinked = new LinkedList();
//        ArrayList arrayList = new ArrayList<String>();

//        KelasAbstract kelasAbstract = new KelasAbstract() {
//            @Override
//            public void isiDahTerserah() {
//                panggilNama("Kambing");
//            }
//        };
//        kelasAbstract.isiDahTerserah();
//        System.out.println(kelasAbstract.getNama());

        for (int i = 0; i < 3; i++) {
            System.out.println("Nilai i : "+i+" Thread : "+Thread.currentThread().getName());
            if(i==0){
//                for (int j = 0; j < 10; j++) {
//                    System.out.println(j +" A : "+Thread.currentThread().getName());
//                }
                Thread t = new Thread(new Runnable() {
                    public void run() {
                        for (int i = 0; i < 10; i++) {
                            System.out.println(i+" A : "+Thread.currentThread().getName());
                        }
                    }
                });
                t.start();
            }

        }
    }
}
