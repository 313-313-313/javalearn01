package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class CO3_TernaryOperator {
    public static void main(String[] args) {
        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("agam bir tam sayı gir:");

        int x=scan.nextInt();
        System.out.println("   *** if-else***   ");

        if(x%2==0){
            System.out.println("agam çift sayı");

        } else System.out.println("agam sayı tek");


        System.out.println(" *** TERNARY**** ");

        String sonuc=(x%2==0 ? "agam sayı çift"  : "agam sayı tek");
        System.out.println("sonuc = " + sonuc);
        System.out.println((x%2==0 ? "agam sayı çift" : "agam satı tek"));
 /*
        ahan da TRICK->  ternary operator işlem sonucunda true veya false göre bir cıktı verir.
        eger bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edlimeli.
         */

        // // TASK02 -> girilen bir tamsayının negatif olmasını kontrol eden code create ediniz.

        System.out.println("   ***   TASK02   ***   ");
        System.out.println(x < 0 ? "agam sayı NEGATİF" : "agam sayı nagatif değil");





    }
}
