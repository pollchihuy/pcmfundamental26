package com.juaracoding.pcmfundamental.berbagailogika;

public class Segitiga {

    public static void main(String[] args) {
        luasSegitiga(3,5);//7.5

        for (int i = 0;
             i < 3;
             i++) {
            System.out.println(i);
        }

        System.exit(1);
        int x = 5;
        if(x==1){
            System.out.println(x);
        }else if(x==2){
            System.out.println(x);
        }else if(x==3){
            System.out.println(x);
        }else if(x==4){
            System.out.println(x);
        }else {
            System.out.println(x);
        }

        switch (x){
            case 1:System.out.println(x);break;
            case 2:System.out.println(x);break;
            case 3:System.out.println(x);break;
            case 4:System.out.println(x);break;
            default:System.out.println(x);break;
        }

        String strHuruf = "e";
        if(strHuruf.equals("a") ||
                strHuruf.equals("i") ||
                strHuruf.equals("u") ||
                strHuruf.equals("e") ||
                strHuruf.equals("o") ){
            System.out.println("Huruf Vokal");
        }else {
            System.out.println("Huruf Konsonan");
        }
        if(strHuruf.equals("b") ||
                strHuruf.equals("c") ||
                strHuruf.equals("d") ||
                strHuruf.equals("f") ||
                strHuruf.equals("g") ||
                strHuruf.equals("h") ||
                strHuruf.equals("z") ){
            System.out.println("Huruf Konsonan");
        }else {

            System.out.println("Huruf Vokal");
        }
    }

    private static void luasSegitiga(int alas, int tinggi){
        double luasSegitiga = alas * tinggi / 2.0;// operan
        System.out.println("Luas Segitiga: " + luasSegitiga);
    }

    private static void luasSegitiga(int alas){
    }

}