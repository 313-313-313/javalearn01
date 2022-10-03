package day02;

import java.util.Scanner;

public class Q02_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
       // Scanner scan= new Scanner(System.in);
       // System.out.println("5 basamaklı bir sayı giriniz");
       // int x=scan.nextInt();
       // System.out.println(((x % 10) + (x / 10) % 10 + (x / 1000) % 10 + (x / 10000) % 10));

        Scanner scan= new Scanner(System.in);
        System.out.println("7 basamaklı bir sayı giriniz");
        int x=scan.nextInt();
        System.out.println((x/10000)%10);



    }
}
