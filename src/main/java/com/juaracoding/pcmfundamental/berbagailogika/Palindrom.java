package com.juaracoding.pcmfundamental.berbagailogika;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 11/06/2025 19:52
@Last Modified 11/06/2025 19:52
Version 1.0
*/
public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String strInput = sc.nextLine();

        strInput = strInput.toLowerCase();
        char [] chArr = strInput.toCharArray();
        int chLength = chArr.length;
        String strTemp = "";
        int intLoop = 0 ;
        String pesan = "Palindrom";
        for (int i = (chLength-1); i >= 0; i--) {
            if(chArr[intLoop] != chArr[i]){
                pesan = "Bukan Palindrom";
             break;
            }
            intLoop++;
        }
        System.out.println(pesan);
//        if(strTemp.equals(strInput)){
//            System.out.println("Palindrom");
//        }else {
//            System.out.println("Not a palindrom");
//        }
    }
}
