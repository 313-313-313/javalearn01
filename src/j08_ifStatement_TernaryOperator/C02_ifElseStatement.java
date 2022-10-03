package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
/*
     TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int t = scan.nextInt();
        if (t > 18) {
            System.out.println("yaşınız 18den büyüktür");
        }

             /*
TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
18 den kuçuk ise ehliyet alamzsınız print ediniz
 */

        if (t >= 18) {
            System.out.println("yasınız 18den küçük değil");
        } else {

            System.out.println("ehliyet alamazsınız");
        }
    }
}





