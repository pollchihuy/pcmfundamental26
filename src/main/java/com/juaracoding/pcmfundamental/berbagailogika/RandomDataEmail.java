package com.juaracoding.pcmfundamental.berbagailogika;

import java.util.Random;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 11/06/2025 20:26
@Last Modified 11/06/2025 20:26
Version 1.0
*/
public class RandomDataEmail {

    /**
     * 1. alfabet ( 8 s.d 16)
     * 2. numerik (0 s.d 999)
     * 3. @ (hc)
     * 4. provider {gmail,ymail,rocketmail,yahoo,jc}
     * 5. dot (hc)
     * 6. domain (com,co.id,biz,edu,sch,ac.id,gov)
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        String strAlfabet = "abcdefghijklmnopqrstuvwxyz";
        char [] chAlfabetChar = strAlfabet.toCharArray();
        int intAlfabetLength = chAlfabetChar.length;
        String [] strProvider = {"gmail","ymail","rocketmail","yahoo","jc"};
        String [] strDomain = {"com","co.id","biz","edu","sch","ac.id","gov"};

        for(int i = 0; i < 100; i++){
            int randomAlfabet = random.nextInt(8,17);
            for (int j = 0; j < randomAlfabet; j++) {
                System.out.print(chAlfabetChar[random.nextInt(intAlfabetLength)]);
            }
            System.out.print(random.nextInt(1000)+"@");
            System.out.print(strProvider[random.nextInt(strProvider.length)]+".");
            System.out.print(strDomain[random.nextInt(strDomain.length)]);
            System.out.println();
        }
    }
}
