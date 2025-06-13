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
public class Child extends Parent{

    public Child() {
        super.printValue("s");
    }

    public void penambahan1(){
        printValue();
    }

    public void penambahan2(){
        super.printValue();
    }
//    public static void main(String[] args) {
//        Parent parent = new Parent();
//        System.out.println(parent);
////        parent.intValue=10;
//        parent.setIntValue(10);
//        parent.printValue();
//        parent.setIntValue(15);
//        parent.printValue();
//    }

    /**
     * public
     * protected
     * no modifier
     * private
     *
     * @param s
     */
    @Override
    void printValue(String s) {
        System.out.println("Nilai Parameter : "+s);
        System.out.println("Dimodifikasi");
    }
}