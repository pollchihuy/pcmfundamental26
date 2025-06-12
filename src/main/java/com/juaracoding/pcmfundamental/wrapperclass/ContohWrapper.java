package com.juaracoding.pcmfundamental.wrapperclass;

import com.juaracoding.pcmfundamental.berbagailogika.ComparingString;

public class ContohWrapper {

    /** variable untuk penampung kalkulasi luas bangunan */
    private int intLuas = 0;

    public static void main(String[] args) {
        boolean isValid = false;
        int intX = 0;
        double douX = 0.0;
        char chVolum = 'x';

        Boolean isOK = false;
        Integer intValue = Integer.parseInt("100");
        Double douValue = 0.0;
        Character chLuas = 'a';

        System.out.println(Integer.toBinaryString(intValue));

        System.out.println(Boolean.parseBoolean("turu"));

        int [] intArr = new int[3];
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

//        Boolean b = new Boolean("a");
//        Boolean c = new Boolean(false);

        char chInput = 'x';
        System.out.println(Character.isDigit(chInput));
        System.out.println(isDigit(chInput));
        /**
         * jika input HutBankBCAKe-40
         * Output 348
         *
         * berapakah output dari Inputan : NomorKe-21
         * output ? 153
         */

        ComparingString c = new ComparingString();
        System.out.println(c);
        String s = new String();
        System.out.println("Value String : "+s);
        String strCompare = new String("ss");
        System.out.println(strCompare.equals("ss"));
        System.out.println(strCompare=="ss");
    }

    private static Boolean isDigit(char ch){
        int intAscii = (int)ch;
        return (intAscii >= 48 && intAscii <= 57);
    }
}
