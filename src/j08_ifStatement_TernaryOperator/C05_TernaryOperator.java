package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz


        Scanner sc = new Scanner(System.in);

        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi = sc.nextInt();
        System.out.println(agaSayisi > 9 ? " sayı iki veya daha fazla basamaklı  " : "sayı tek basamaklı");

        String sonuc =( agaSayisi > 9 ||agaSayisi<-9)? " sayı iki veya daha fazla basamaklı  " : "sayı tek basamaklı";
        System.out.println(sonuc);



    }
}