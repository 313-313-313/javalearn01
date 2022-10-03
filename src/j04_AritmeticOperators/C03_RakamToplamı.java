package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {
        //Kullanıcıdan alınan üç basamaklı bir sayının rakamları toplamını create eden code yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz : ");

        int sayi = scan.nextInt();

        int birler = sayi % 10;//sayının birler basamagı
        sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
        int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
        int yüzler = sayi / 10;// 85'in 10' a bolumu ->8

        int rakamlartoplamı=birler+onlar+yüzler;
        System.out.println("rakamlartoplamı = " + rakamlartoplamı);
    }
}
