package j13_Break_Continue_Statement;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        //TASK-->Girilen tam sayının asal olmasını kontrol eden code create ediniz.
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi=scanner.nextInt();

        boolean asalMı=true;
        for(int i=2;i<sayi;i++) {
            if(sayi%i==0) {
                asalMı=false;
                break;
            }
        } if(asalMı) {
            System.out.println("girilen sayı ASAl");
        }else System.out.println("girilen sayı ASAL değil");
    }
}
