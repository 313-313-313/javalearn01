package day01;

import java.util.Scanner;

public class Q08_Scanner {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
// bu tam sayilari toplayin ve sonucu yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayi giriniz:");
        int sayi1=scan.nextInt();
        System.out.println("ikinci sayi giriniz");
        int sayi2=scan.nextInt();

        int sum=sayi1+sayi2;
        System.out.println("sum = " + sum);
    }
}
