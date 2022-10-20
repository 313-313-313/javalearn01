package day07;

import java.util.Scanner;



public class Q07_DoWhile {

/*
 Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
 ve x girildiğinde ise "Program bitti" yazan programı yazınız.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char c;
    do {
        System.out.println("harf giriniz:");
        c = scanner.next().toLowerCase().charAt(0);
        System.out.println("program çalışıyor");
    } while (c!= 'x') ;
    System.out.println("program bitti");
}
}
