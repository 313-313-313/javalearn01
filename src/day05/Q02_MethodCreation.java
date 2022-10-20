package day05;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {

/* Write a method named isEven that accepts an integer argument.
 The method should return true if the argument is even, or false otherwise.*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:"); int sayi=scanner.nextInt();

        System.out.println(isEven(sayi));

    }
    public static boolean isEven(int sayi) {
        return sayi%2==0? true :false;
    }

}
